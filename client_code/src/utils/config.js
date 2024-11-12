const config = {
    get() {
        return {
            url : process.env.VUE_APP_BASE_API_URL + process.env.VUE_APP_BASE_API + '/',
            name: process.env.VUE_APP_BASE_API,
			menuList:[
				{
					name: '会议室信息管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'会议室信息',
							url:'/index/huiyishixinxiList'
						},
					]
				},
				{
					name: '会议资料管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'会议资料',
							url:'/index/huiyiziliaoList'
						},
					]
				},
				{
					name: '会议提醒管理',
					icon: '${frontMenu.fontClass}',
					child:[
						{
							name:'会议提醒',
							url:'/index/huiyitixingList'
						},
					]
				},
			]
        }
    },
    getProjectName(){
        return {
            projectName: "基于vue的会议管理系统的设计与实现"
        } 
    }
}
export default config
