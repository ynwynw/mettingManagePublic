	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import news from '@/views/news/list'
	import huiyishiliebiao from '@/views/huiyishiliebiao/list'
	import huiyitixing from '@/views/huiyitixing/list'
	import yonghu from '@/views/yonghu/list'
	import huiyiziliao from '@/views/huiyiziliao/list'
	import canhuixinxi from '@/views/canhuixinxi/list'
	import config from '@/views/config/list'
	import users from '@/views/users/list'
	import huiyishixinxi from '@/views/huiyishixinxi/list'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/news',
			name: '公告信息',
			component: news
		}
		,{
			path: '/huiyishiliebiao',
			name: '会议室列表',
			component: huiyishiliebiao
		}
		,{
			path: '/huiyitixing',
			name: '会议提醒',
			component: huiyitixing
		}
		,{
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}
		,{
			path: '/huiyiziliao',
			name: '会议资料',
			component: huiyiziliao
		}
		,{
			path: '/canhuixinxi',
			name: '参会信息',
			component: canhuixinxi
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		,{
			path: '/users',
			name: '管理员',
			component: users
		}
		,{
			path: '/huiyishixinxi',
			name: '会议室信息',
			component: huiyishixinxi
		}
		]
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
