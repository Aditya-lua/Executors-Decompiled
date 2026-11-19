; mbedtls_psa_hash_compute @ 00b9db98
00b9db98	sub sp,sp,#0x140
00b9db9c	stp x28,x25,[sp, #0xf0]
00b9dba0	stp x24,x23,[sp, #0x100]
00b9dba4	stp x22,x21,[sp, #0x110]
00b9dba8	stp x20,x19,[sp, #0x120]
00b9dbac	stp x29,x30,[sp, #0x130]
00b9dbb0	add x29,sp,#0x130
00b9dbb4	mrs x25,tpidr_el0
00b9dbb8	ldr x8,[x25, #0x28]
00b9dbbc	mov x22,x2
00b9dbc0	mov x23,x1
00b9dbc4	mov w24,w0
00b9dbc8	add x0,sp,#0x8
00b9dbcc	orr w2,wzr,#0xe0
00b9dbd0	mov w1,wzr
00b9dbd4	mov x19,x5
00b9dbd8	mov x20,x4
00b9dbdc	mov x21,x3
00b9dbe0	stur x8,[x29, #-0x48]
00b9dbe4	bl 0x00c301c0
00b9dbe8	add x0,sp,#0x8
00b9dbec	mov w1,w24
00b9dbf0	str x20,[x19]
00b9dbf4	bl 0x00c43020
00b9dbf8	mov w24,w0
00b9dbfc	cbnz w0,0x00b9dc30
00b9dc00	add x0,sp,#0x8
00b9dc04	mov x1,x23
00b9dc08	mov x2,x22
00b9dc0c	bl 0x00c43030
00b9dc10	mov w24,w0
00b9dc14	cbnz w0,0x00b9dc30
00b9dc18	add x0,sp,#0x8
00b9dc1c	mov x1,x21
00b9dc20	mov x2,x20
00b9dc24	mov x3,x19
00b9dc28	bl 0x00c43010
00b9dc2c	mov w24,w0
00b9dc30	add x0,sp,#0x8
00b9dc34	bl 0x00c42fe0
00b9dc38	ldr x8,[x25, #0x28]
00b9dc3c	ldur x9,[x29, #-0x48]
00b9dc40	cmp w24,#0x0
00b9dc44	csel w0,w0,w24,eq
00b9dc48	cmp x8,x9
00b9dc4c	b.ne 0x00b9dc6c
00b9dc50	ldp x29,x30,[sp, #0x130]
00b9dc54	ldp x20,x19,[sp, #0x120]
00b9dc58	ldp x22,x21,[sp, #0x110]
00b9dc5c	ldp x24,x23,[sp, #0x100]
00b9dc60	ldp x28,x25,[sp, #0xf0]
00b9dc64	add sp,sp,#0x140
00b9dc68	ret
00b9dc6c	bl 0x00c2fec0
