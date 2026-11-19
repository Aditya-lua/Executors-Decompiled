; EVP_PKEY_CTX_set_dh_kdf_outlen @ 00a56f18
00a56f18	sub sp,sp,#0xa0
00a56f1c	stp x29,x30,[sp, #0x90]
00a56f20	add x29,sp,#0x90
00a56f24	sxtw x8,w1
00a56f28	str x19,[sp, #0x80]
00a56f2c	stur x8,[x29, #-0x8]
00a56f30	cbz x0,0x00a56fcc
00a56f34	ldr w8,[x0]
00a56f38	mov x19,x0
00a56f3c	cmp w8,#0x800
00a56f40	b.ne 0x00a56fcc
00a56f44	ldr x8,[x19, #0x20]
00a56f48	cbz x8,0x00a5700c
00a56f4c	cmp w1,#0x1
00a56f50	b.lt 0x00a56ff8
00a56f54	adrp x0,0x2c9000
00a56f58	add x0,x0,#0x866
00a56f5c	add x8,sp,#0x8
00a56f60	sub x1,x29,#0x8
00a56f64	bl 0x00c36270
00a56f68	ldr x8,[sp, #0x28]
00a56f6c	ldur q0,[sp, #0x18]
00a56f70	ldur q1,[sp, #0x8]
00a56f74	str x8,[sp, #0x50]
00a56f78	add x8,sp,#0x8
00a56f7c	stp q1,q0,[sp, #0x30]
00a56f80	bl 0x00c34c40
00a56f84	ldr x8,[sp, #0x28]
00a56f88	ldur q0,[sp, #0x18]
00a56f8c	ldur q1,[sp, #0x8]
00a56f90	add x1,sp,#0x30
00a56f94	mov x0,x19
00a56f98	str x8,[sp, #0x78]
00a56f9c	stur q0,[sp, #0x68]
00a56fa0	stur q1,[sp, #0x58]
00a56fa4	bl 0x00c3c120
00a56fa8	cmn w0,#0x2
00a56fac	b.ne 0x00a56ffc
00a56fb0	bl 0x00c342a0
00a56fb4	adrp x0,0x2cf000
00a56fb8	adrp x2,0x2db000
00a56fbc	add x0,x0,#0xb4f
00a56fc0	add x2,x2,#0xfc8
00a56fc4	mov w1,#0x105
00a56fc8	b 0x00a56fe4
00a56fcc	bl 0x00c342a0
00a56fd0	adrp x0,0x2cf000
00a56fd4	adrp x2,0x2b7000
00a56fd8	add x0,x0,#0xb4f
00a56fdc	add x2,x2,#0xc4b
00a56fe0	mov w1,#0x25
00a56fe4	bl 0x00c342b0
00a56fe8	orr w0,wzr,#0x6
00a56fec	mov w1,#0x93
00a56ff0	mov x2,xzr
00a56ff4	bl 0x00c342c0
00a56ff8	orr w0,wzr,#0xfffffffe
00a56ffc	ldp x29,x30,[sp, #0x90]
00a57000	ldr x19,[sp, #0x80]
00a57004	add sp,sp,#0xa0
00a57008	ret
00a5700c	ldr x8,[x19, #0x78]
00a57010	ldr w8,[x8]
00a57014	cmp w8,#0x398
00a57018	b.eq 0x00a56f4c
00a5701c	cmp w8,#0x1c
00a57020	b.eq 0x00a56f4c
00a57024	mov w0,#0xffffffff
00a57028	b 0x00a56ffc
