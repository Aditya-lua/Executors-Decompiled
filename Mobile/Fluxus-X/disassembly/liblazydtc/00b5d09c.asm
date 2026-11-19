; FUN_00b5d09c @ 00b5d09c
00b5d09c	stp x22,x21,[sp, #-0x30]!
00b5d0a0	stp x20,x19,[sp, #0x10]
00b5d0a4	stp x29,x30,[sp, #0x20]
00b5d0a8	add x29,sp,#0x20
00b5d0ac	mov x20,x0
00b5d0b0	bl 0x00c41000
00b5d0b4	cbz w0,0x00b5d174
00b5d0b8	adrp x1,0x2aa000
00b5d0bc	add x1,x1,#0xfdb
00b5d0c0	mov w0,#0x190
00b5d0c4	mov w2,#0x18e
00b5d0c8	bl 0x00c34250
00b5d0cc	mov x19,x0
00b5d0d0	cbz x0,0x00b5d178
00b5d0d4	mov w2,#0x190
00b5d0d8	mov x0,x19
00b5d0dc	mov x1,x20
00b5d0e0	bl 0x00c2ffd0
00b5d0e4	mov x22,x19
00b5d0e8	str xzr,[x22, #0x8]!
00b5d0ec	str xzr,[x22, #0x8]
00b5d0f0	stp xzr,xzr,[x22, #0x168]
00b5d0f4	ldr x0,[x20, #0x10]
00b5d0f8	add x21,x22,#0x168
00b5d0fc	cbz x0,0x00b5d108
00b5d100	bl 0x00c3afa0
00b5d104	cbz w0,0x00b5d118
00b5d108	ldr x8,[x20, #0x180]
00b5d10c	cbnz x8,0x00b5d118
00b5d110	ldr x8,[x20, #0x188]
00b5d114	cbz x8,0x00b5d18c
00b5d118	ldr x0,[x19, #0x8]
00b5d11c	adrp x20,0x2aa000
00b5d120	add x20,x20,#0xfdb
00b5d124	mov w2,#0x179
00b5d128	mov x1,x20
00b5d12c	bl 0x00c32310
00b5d130	ldr x0,[x19, #0x178]
00b5d134	bl 0x00c31f90
00b5d138	ldr x0,[x19, #0x170]
00b5d13c	bl 0x00c35800
00b5d140	str xzr,[x19, #0x8]
00b5d144	str xzr,[x19, #0x160]
00b5d148	stp xzr,xzr,[x21]
00b5d14c	ldr x0,[x19, #0x10]
00b5d150	bl 0x00c3a7c0
00b5d154	ldr x0,[x19, #0x180]
00b5d158	bl 0x00c322e0
00b5d15c	ldr x0,[x19, #0x188]
00b5d160	bl 0x00c322e0
00b5d164	mov w2,#0x183
00b5d168	mov x0,x19
00b5d16c	mov x1,x20
00b5d170	bl 0x00c32310
00b5d174	mov x19,xzr
00b5d178	mov x0,x19
00b5d17c	ldp x29,x30,[sp, #0x20]
00b5d180	ldp x20,x19,[sp, #0x10]
00b5d184	ldp x22,x21,[sp], #0x30
00b5d188	ret
00b5d18c	ldr x8,[x20, #0x10]
00b5d190	str x8,[x19, #0x10]
00b5d194	ldr x0,[x20, #0x170]
00b5d198	cbz x0,0x00b5d1a8
00b5d19c	bl 0x00c35820
00b5d1a0	cbz w0,0x00b5d118
00b5d1a4	ldr x0,[x20, #0x170]
00b5d1a8	str x0,[x21]
00b5d1ac	ldr x8,[x20, #0x178]
00b5d1b0	cbz x8,0x00b5d1cc
00b5d1b4	bl 0x00c31fa0
00b5d1b8	str x0,[x19, #0x178]
00b5d1bc	cbz x0,0x00b5d118
00b5d1c0	ldr x1,[x20, #0x178]
00b5d1c4	bl 0x00c34bf0
00b5d1c8	cbz w0,0x00b5d118
00b5d1cc	ldr x0,[x20, #0x8]
00b5d1d0	cbz x0,0x00b5d178
00b5d1d4	adrp x1,0x2aa000
00b5d1d8	add x1,x1,#0xfdb
00b5d1dc	mov w2,#0x1ab
00b5d1e0	bl 0x00c34600
00b5d1e4	str x0,[x22]
00b5d1e8	cbnz x0,0x00b5d178
00b5d1ec	b 0x00b5d118
