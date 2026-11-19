; ossl_prov_cleanup_entropy @ 00b201fc
00b201fc	sub sp,sp,#0x30
00b20200	stp x20,x19,[sp, #0x10]
00b20204	stp x29,x30,[sp, #0x20]
00b20208	adrp x8,0xd23000
00b2020c	mov x20,x1
00b20210	ldr x1,[x8, #0x810]
00b20214	add x29,sp,#0x20
00b20218	cbz x1,0x00b20244
00b2021c	mov x19,x2
00b20220	str x1,[sp, #0x8]
00b20224	bl 0x00c410c0
00b20228	mov x1,x20
00b2022c	mov x2,x19
00b20230	ldr x3,[sp, #0x8]
00b20234	ldp x29,x30,[sp, #0x20]
00b20238	ldp x20,x19,[sp, #0x10]
00b2023c	add sp,sp,#0x30
00b20240	br x3
00b20244	ldp x29,x30,[sp, #0x20]
00b20248	ldp x20,x19,[sp, #0x10]
00b2024c	add sp,sp,#0x30
00b20250	ret
