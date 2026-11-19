; ossl_policy_tree_find_sk @ 00b13978
00b13978	sub sp,sp,#0x60
00b1397c	str x1,[sp, #0x28]
00b13980	add x8,sp,#0x20
00b13984	add x1,sp,#0x8
00b13988	str x19,[sp, #0x40]
00b1398c	stp x29,x30,[sp, #0x50]
00b13990	add x29,sp,#0x50
00b13994	mov x19,x0
00b13998	str x8,[sp, #0x8]
00b1399c	bl 0x00c34760
00b139a0	mov w1,w0
00b139a4	mov x0,x19
00b139a8	bl 0x00c32610
00b139ac	ldp x29,x30,[sp, #0x50]
00b139b0	ldr x19,[sp, #0x40]
00b139b4	add sp,sp,#0x60
00b139b8	ret
