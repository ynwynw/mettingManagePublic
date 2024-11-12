import { createRouter, createWebHashHistory } from 'vue-router'
import index from '../views'
import home from '../views/pages/home.vue'
import login from '../views/pages/login.vue'
import newsList from '@/views/pages/news/list'
import yonghuList from '@/views/pages/yonghu/list'
import yonghuDetail from '@/views/pages/yonghu/formModel'
import yonghuAdd from '@/views/pages/yonghu/formAdd'
import yonghuRegister from '@/views/pages/yonghu/register'
import yonghuCenter from '@/views/pages/yonghu/center'
import huiyishiliebiaoList from '@/views/pages/huiyishiliebiao/list'
import huiyishiliebiaoDetail from '@/views/pages/huiyishiliebiao/formModel'
import huiyishiliebiaoAdd from '@/views/pages/huiyishiliebiao/formAdd'
import huiyishixinxiList from '@/views/pages/huiyishixinxi/list'
import huiyishixinxiDetail from '@/views/pages/huiyishixinxi/formModel'
import huiyishixinxiAdd from '@/views/pages/huiyishixinxi/formAdd'
import huiyiziliaoList from '@/views/pages/huiyiziliao/list'
import huiyiziliaoDetail from '@/views/pages/huiyiziliao/formModel'
import huiyiziliaoAdd from '@/views/pages/huiyiziliao/formAdd'
import huiyitixingList from '@/views/pages/huiyitixing/list'
import huiyitixingDetail from '@/views/pages/huiyitixing/formModel'
import huiyitixingAdd from '@/views/pages/huiyitixing/formAdd'
import canhuixinxiList from '@/views/pages/canhuixinxi/list'
import canhuixinxiDetail from '@/views/pages/canhuixinxi/formModel'
import canhuixinxiAdd from '@/views/pages/canhuixinxi/formAdd'

const routes = [{
		path: '/',
		redirect: '/index/home'
	},
	{
		path: '/index',
		component: index,
		children: [{
			path: 'home',
			component: home
		}
		, {
			path: 'newsList',
			component: newsList
		}
		, {
			path: 'yonghuList',
			component: yonghuList
		}, {
			path: 'yonghuDetail',
			component: yonghuDetail
		}, {
			path: 'yonghuAdd',
			component: yonghuAdd
		}
		, {
			path: 'yonghuCenter',
			component: yonghuCenter
		}
		, {
			path: 'huiyishiliebiaoList',
			component: huiyishiliebiaoList
		}, {
			path: 'huiyishiliebiaoDetail',
			component: huiyishiliebiaoDetail
		}, {
			path: 'huiyishiliebiaoAdd',
			component: huiyishiliebiaoAdd
		}
		, {
			path: 'huiyishixinxiList',
			component: huiyishixinxiList
		}, {
			path: 'huiyishixinxiDetail',
			component: huiyishixinxiDetail
		}, {
			path: 'huiyishixinxiAdd',
			component: huiyishixinxiAdd
		}
		, {
			path: 'huiyiziliaoList',
			component: huiyiziliaoList
		}, {
			path: 'huiyiziliaoDetail',
			component: huiyiziliaoDetail
		}, {
			path: 'huiyiziliaoAdd',
			component: huiyiziliaoAdd
		}
		, {
			path: 'huiyitixingList',
			component: huiyitixingList
		}, {
			path: 'huiyitixingDetail',
			component: huiyitixingDetail
		}, {
			path: 'huiyitixingAdd',
			component: huiyitixingAdd
		}
		, {
			path: 'canhuixinxiList',
			component: canhuixinxiList
		}, {
			path: 'canhuixinxiDetail',
			component: canhuixinxiDetail
		}, {
			path: 'canhuixinxiAdd',
			component: canhuixinxiAdd
		}
		]
	},
	{
		path: '/login',
		component: login
	}
	,{
		path: '/yonghuRegister',
		component: yonghuRegister
	}
]

const router = createRouter({
  history: createWebHashHistory(process.env.BASE_URL),
  routes
})

export default router
