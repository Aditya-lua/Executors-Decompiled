; ix::SelectInterruptPipe::notify @ 00985df0
00985df0	sub sp,sp,#0x40
00985df4	str x21,[sp, #0x10]
00985df8	stp x20,x19,[sp, #0x20]
00985dfc	stp x29,x30,[sp, #0x30]
00985e00	add x29,sp,#0x30
00985e04	mrs x21,tpidr_el0
00985e08	ldr x8,[x21, #0x28]
00985e0c	add x19,x0,#0x10
00985e10	mov x20,x0
00985e14	mov x0,x19
00985e18	str x8,[sp, #0x8]
00985e1c	str x1,[sp]
00985e20	bl 0x00c2ff10
00985e24	ldr w20,[x20, #0xc]
00985e28	cmn w20,#0x1
00985e2c	b.eq 0x00985e68
00985e30	mov x1,sp
00985e34	mov w2,#0x8
00985e38	mov w0,w20
00985e3c	bl 0x00c31cc0
00985e40	cmn x0,#0x1
00985e44	b.ne 0x00985e5c
00985e48	bl 0x00c30710
00985e4c	ldr w8,[x0]
00985e50	cmp w8,#0x4
00985e54	b.eq 0x00985e30
00985e58	mov x0,#-0x1
00985e5c	cmp x0,#0x8
00985e60	cset w20,eq
00985e64	b 0x00985e6c
00985e68	mov w20,wzr
00985e6c	mov x0,x19
00985e70	bl 0x00c2ff20
00985e74	ldr x8,[x21, #0x28]
00985e78	ldr x9,[sp, #0x8]
00985e7c	cmp x8,x9
00985e80	b.ne 0x00985e9c
00985e84	mov w0,w20
00985e88	ldp x29,x30,[sp, #0x30]
00985e8c	ldp x20,x19,[sp, #0x20]
00985e90	ldr x21,[sp, #0x10]
00985e94	add sp,sp,#0x40
00985e98	ret
00985e9c	bl 0x00c2fec0
