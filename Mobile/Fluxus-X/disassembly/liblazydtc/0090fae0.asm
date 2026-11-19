; FUN_0090fae0 @ 0090fae0
0090fae0	str x21,[sp, #-0x30]!
0090fae4	stp x20,x19,[sp, #0x10]
0090fae8	stp x29,x30,[sp, #0x20]
0090faec	add x29,sp,#0x20
0090faf0	mov x21,x2
0090faf4	mov x20,x1
0090faf8	mov x19,x0
0090fafc	bl 0x00c31000
0090fb00	str x0,[x19, #0x80]
0090fb04	cbz x0,0x0090fb58
0090fb08	ldr w8,[x0, #0x131c]
0090fb0c	adrp x2,0xcb4000
0090fb10	adrp x3,0xcb4000
0090fb14	adrp x4,0x90f000
0090fb18	orr w8,w8,#0x40000
0090fb1c	str w8,[x0, #0x131c]
0090fb20	ldr x2,[x2, #0xe00]
0090fb24	ldr x3,[x3, #0xe08]
0090fb28	add x4,x4,#0xb6c
0090fb2c	mov x0,x19
0090fb30	mov x1,x21
0090fb34	bl 0x009164e8
0090fb38	ldr x8,[x19, #0x80]
0090fb3c	add x0,x19,#0x58
0090fb40	mov x1,xzr
0090fb44	str x19,[x8, #0xc38]
0090fb48	str x20,[x19, #0x88]
0090fb4c	bl 0x00925c98
0090fb50	mov w0,wzr
0090fb54	b 0x0090fb5c
0090fb58	mov w0,#0x1
0090fb5c	ldp x29,x30,[sp, #0x20]
0090fb60	ldp x20,x19,[sp, #0x10]
0090fb64	ldr x21,[sp], #0x30
0090fb68	ret
