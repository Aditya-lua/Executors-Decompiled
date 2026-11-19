; do_engine_lock_init_ossl_ @ 00a511f8
00a511f8	stp x29,x30,[sp, #-0x10]!
00a511fc	mov x29,sp
00a51200	bl 0x00c34d50
00a51204	adrp x8,0xcb5000
00a51208	ldr x8,[x8, #0x5d8]
00a5120c	adrp x9,0xcb5000
00a51210	cmp x0,#0x0
00a51214	str x0,[x8]
00a51218	ldr x9,[x9, #0x5e8]
00a5121c	cset w8,ne
00a51220	str w8,[x9]
00a51224	ldp x29,x30,[sp], #0x10
00a51228	ret
