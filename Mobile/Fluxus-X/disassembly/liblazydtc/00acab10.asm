; ossl_rand_pool_add_begin @ 00acab10
00acab10	str x19,[sp, #-0x20]!
00acab14	stp x29,x30,[sp, #0x10]
00acab18	add x29,sp,#0x10
00acab1c	cbz x1,0x00acabb0
00acab20	ldr x8,[x0, #0x20]
00acab24	ldr x9,[x0, #0x8]
00acab28	mov x19,x0
00acab2c	sub x8,x8,x9
00acab30	cmp x8,x1
00acab34	b.cs 0x00acab60
00acab38	bl 0x00c342a0
00acab3c	adrp x0,0x29e000
00acab40	adrp x2,0x29e000
00acab44	add x0,x0,#0x966
00acab48	add x2,x2,#0x97e
00acab4c	mov w1,#0x16e
00acab50	bl 0x00c342b0
00acab54	mov w0,#0x24
00acab58	mov w1,#0x7d
00acab5c	b 0x00acaba8
00acab60	ldr x8,[x19]
00acab64	cbz x8,0x00acab80
00acab68	mov x0,x19
00acab6c	bl 0x00aca884
00acab70	cbz w0,0x00acabb0
00acab74	ldp x8,x9,[x19]
00acab78	add x0,x8,x9
00acab7c	b 0x00acabb4
00acab80	bl 0x00c342a0
00acab84	adrp x0,0x29e000
00acab88	adrp x2,0x29e000
00acab8c	add x0,x0,#0x966
00acab90	add x2,x2,#0x97e
00acab94	mov w1,#0x173
00acab98	bl 0x00c342b0
00acab9c	mov w1,#0x103
00acaba0	mov w0,#0x24
00acaba4	movk w1,#0xc, LSL #16
00acaba8	mov x2,xzr
00acabac	bl 0x00c342c0
00acabb0	mov x0,xzr
00acabb4	ldp x29,x30,[sp, #0x10]
00acabb8	ldr x19,[sp], #0x20
00acabbc	ret
