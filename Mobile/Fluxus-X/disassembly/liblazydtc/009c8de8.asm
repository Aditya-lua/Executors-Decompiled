; ssl_srp_calc_a_param_intern @ 009c8de8
009c8de8	sub sp,sp,#0x50
009c8dec	stp x29,x30,[sp, #0x40]
009c8df0	ldr x8,[x0, #0x9a8]
009c8df4	str x19,[sp, #0x30]
009c8df8	mov x19,x0
009c8dfc	mov x1,sp
009c8e00	ldr x0,[x8]
009c8e04	orr w2,wzr,#0x30
009c8e08	mov w3,wzr
009c8e0c	add x29,sp,#0x40
009c8e10	bl 0x00c358b0
009c8e14	cmp w0,#0x1
009c8e18	b.lt 0x009c8e5c
009c8e1c	ldr x2,[x19, #0xc20]
009c8e20	mov x0,sp
009c8e24	orr w1,wzr,#0x30
009c8e28	bl 0x00c36970
009c8e2c	str x0,[x19, #0xc20]
009c8e30	mov x0,sp
009c8e34	orr w1,wzr,#0x30
009c8e38	bl 0x00c34750
009c8e3c	ldr x0,[x19, #0xc20]
009c8e40	ldr x1,[x19, #0xbf8]
009c8e44	ldr x2,[x19, #0xc00]
009c8e48	bl 0x00c369d0
009c8e4c	cmp x0,#0x0
009c8e50	str x0,[x19, #0xc18]
009c8e54	cset w0,ne
009c8e58	b 0x009c8e60
009c8e5c	mov w0,wzr
009c8e60	ldp x29,x30,[sp, #0x40]
009c8e64	ldr x19,[sp, #0x30]
009c8e68	add sp,sp,#0x50
009c8e6c	ret
