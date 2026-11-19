; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_max_length @ 00bfe954
00bfe954	paciasp
00bfe958	sub sp,sp,#0x30
00bfe95c	stp x29,x30,[sp, #0x10]
00bfe960	stp x20,x19,[sp, #0x20]
00bfe964	add x29,sp,#0x10
00bfe968	ldr x0,[x0, #0x10]
00bfe96c	cbz x0,0x00bfe994
00bfe970	bl 0x00c43880
00bfe974	mov x20,x0
00bfe978	str x0,[sp, #0x8]
00bfe97c	bl 0x00c43a40
00bfe980	mov x19,x0
00bfe984	cbz x20,0x00bfe998
00bfe988	mov x0,x20
00bfe98c	bl 0x00c43880
00bfe990	b 0x00bfe998
00bfe994	mov w19,#0x1
00bfe998	mov w0,w19
00bfe99c	ldp x20,x19,[sp, #0x20]
00bfe9a0	ldp x29,x30,[sp, #0x10]
00bfe9a4	add sp,sp,#0x30
00bfe9a8	autiasp
00bfe9ac	ret
