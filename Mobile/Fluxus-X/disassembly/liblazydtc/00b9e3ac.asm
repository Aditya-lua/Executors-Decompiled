; mbedtls_psa_mac_verify_finish @ 00b9e3ac
00b9e3ac	sub sp,sp,#0x80
00b9e3b0	stp x22,x21,[sp, #0x50]
00b9e3b4	stp x20,x19,[sp, #0x60]
00b9e3b8	stp x29,x30,[sp, #0x70]
00b9e3bc	add x29,sp,#0x70
00b9e3c0	mrs x22,tpidr_el0
00b9e3c4	ldr x8,[x22, #0x28]
00b9e3c8	mov x20,x2
00b9e3cc	mov x21,x1
00b9e3d0	stur x8,[x29, #-0x28]
00b9e3d4	ldr w8,[x0]
00b9e3d8	cbz w8,0x00b9e3ec
00b9e3dc	cmp x20,#0x40
00b9e3e0	b.ls 0x00b9e3f4
00b9e3e4	mov w19,#0xffffff79
00b9e3e8	b 0x00b9e430
00b9e3ec	mov w19,#0xffffff77
00b9e3f0	b 0x00b9e430
00b9e3f4	add x1,sp,#0x8
00b9e3f8	mov x2,x20
00b9e3fc	bl 0x00b9e1e0
00b9e400	mov w19,w0
00b9e404	cbnz w0,0x00b9e424
00b9e408	add x1,sp,#0x8
00b9e40c	mov x0,x21
00b9e410	mov x2,x20
00b9e414	bl 0x00c42190
00b9e418	cmp w0,#0x0
00b9e41c	mov w8,#0xffffff6b
00b9e420	csel w19,wzr,w8,eq
00b9e424	add x0,sp,#0x8
00b9e428	mov w1,#0x40
00b9e42c	bl 0x00c42220
00b9e430	ldr x8,[x22, #0x28]
00b9e434	ldur x9,[x29, #-0x28]
00b9e438	cmp x8,x9
00b9e43c	b.ne 0x00b9e458
00b9e440	mov w0,w19
00b9e444	ldp x29,x30,[sp, #0x70]
00b9e448	ldp x20,x19,[sp, #0x60]
00b9e44c	ldp x22,x21,[sp, #0x50]
00b9e450	add sp,sp,#0x80
00b9e454	ret
00b9e458	bl 0x00c2fec0
