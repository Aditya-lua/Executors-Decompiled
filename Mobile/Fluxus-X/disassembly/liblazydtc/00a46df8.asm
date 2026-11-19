; ossl_c448_ed448_derive_public_key @ 00a46df8
00a46df8	sub sp,sp,#0x1a0
00a46dfc	stp x29,x30,[sp, #0x190]
00a46e00	add x29,sp,#0x190
00a46e04	stp x28,x19,[sp, #0x180]
00a46e08	mov x4,x3
00a46e0c	mov x3,x2
00a46e10	mov x19,x1
00a46e14	sub x1,x29,#0x4c
00a46e18	mov w2,#0x39
00a46e1c	bl 0x00a46d30
00a46e20	cbz w0,0x00a46eac
00a46e24	ldurb w8,[x29, #-0x4c]
00a46e28	sub x0,x29,#0x88
00a46e2c	sub x1,x29,#0x4c
00a46e30	mov w2,#0x39
00a46e34	and w8,w8,#0xfc
00a46e38	sturb w8,[x29, #-0x4c]
00a46e3c	ldurb w8,[x29, #-0x15]
00a46e40	sturb wzr,[x29, #-0x14]
00a46e44	orr w8,w8,#0x80
00a46e48	sturb w8,[x29, #-0x15]
00a46e4c	bl 0x00c3a610
00a46e50	sub x0,x29,#0x88
00a46e54	sub x1,x29,#0x88
00a46e58	bl 0x00c3a640
00a46e5c	sub x0,x29,#0x88
00a46e60	sub x1,x29,#0x88
00a46e64	bl 0x00c3a640
00a46e68	adrp x8,0xcb5000
00a46e6c	ldr x8,[x8, #0x528]
00a46e70	mov x0,sp
00a46e74	sub x2,x29,#0x88
00a46e78	ldr x1,[x8]
00a46e7c	bl 0x00c3a530
00a46e80	mov x1,sp
00a46e84	mov x0,x19
00a46e88	bl 0x00c3a520
00a46e8c	sub x0,x29,#0x88
00a46e90	bl 0x00c3a620
00a46e94	mov x0,sp
00a46e98	bl 0x00c3a500
00a46e9c	sub x0,x29,#0x4c
00a46ea0	mov w1,#0x39
00a46ea4	bl 0x00c34750
00a46ea8	mov w0,#0xffffffff
00a46eac	ldp x29,x30,[sp, #0x190]
00a46eb0	ldp x28,x19,[sp, #0x180]
00a46eb4	add sp,sp,#0x1a0
00a46eb8	ret
