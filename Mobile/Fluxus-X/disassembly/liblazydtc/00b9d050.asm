; mbedtls_psa_ffdh_export_public_key @ 00b9d050
00b9d050	sub sp,sp,#0xa0
00b9d054	str x25,[sp, #0x50]
00b9d058	stp x24,x23,[sp, #0x60]
00b9d05c	stp x22,x21,[sp, #0x70]
00b9d060	stp x20,x19,[sp, #0x80]
00b9d064	stp x29,x30,[sp, #0x90]
00b9d068	add x29,sp,#0x90
00b9d06c	mrs x25,tpidr_el0
00b9d070	ldr x8,[x25, #0x28]
00b9d074	mov x19,x5
00b9d078	mov x20,x3
00b9d07c	mov x21,x2
00b9d080	str x8,[sp, #0x48]
00b9d084	ldrh w8,[x0]
00b9d088	mov x22,x0
00b9d08c	mov x24,x1
00b9d090	and w8,w8,#0x7000
00b9d094	cmp w8,#0x4, LSL #12
00b9d098	b.ne 0x00b9d0ac
00b9d09c	subs x22,x4,x21
00b9d0a0	b.cs 0x00b9d13c
00b9d0a4	mov w22,#0xffffff76
00b9d0a8	b 0x00b9d164
00b9d0ac	add x0,sp,#0x38
00b9d0b0	bl 0x00c41c00
00b9d0b4	add x0,sp,#0x28
00b9d0b8	bl 0x00c41c00
00b9d0bc	add x0,sp,#0x18
00b9d0c0	bl 0x00c41c00
00b9d0c4	add x0,sp,#0x8
00b9d0c8	bl 0x00c41c00
00b9d0cc	ldrh w8,[x22, #0x2]
00b9d0d0	add x8,x8,#0x7
00b9d0d4	lsr x23,x8,#0x3
00b9d0d8	sub x9,x23,#0x100
00b9d0dc	ror x8,x9,#0x7
00b9d0e0	cmp x8,#0x6
00b9d0e4	b.hi 0x00b9d0f8
00b9d0e8	ubfx x9,x9,#0x7,#0x8
00b9d0ec	mov w10,#0x57
00b9d0f0	lsr w9,w10,w9
00b9d0f4	tbnz w9,#0x0,0x00b9d194
00b9d0f8	mov w19,wzr
00b9d0fc	mov w21,#0xffffff92
00b9d100	mov w22,#0xffffff79
00b9d104	add x0,sp,#0x8
00b9d108	bl 0x00c41bb0
00b9d10c	add x0,sp,#0x28
00b9d110	bl 0x00c41bb0
00b9d114	add x0,sp,#0x18
00b9d118	bl 0x00c41bb0
00b9d11c	add x0,sp,#0x38
00b9d120	bl 0x00c41bb0
00b9d124	cbz w19,0x00b9d164
00b9d128	cbz w21,0x00b9d164
00b9d12c	mov w0,w21
00b9d130	bl 0x00c42bf0
00b9d134	mov w22,w0
00b9d138	b 0x00b9d164
00b9d13c	mov x0,x20
00b9d140	mov x1,x24
00b9d144	mov x2,x21
00b9d148	bl 0x00c2ffd0
00b9d14c	add x0,x20,x21
00b9d150	mov w1,wzr
00b9d154	mov x2,x22
00b9d158	bl 0x00c301c0
00b9d15c	mov w22,wzr
00b9d160	str x21,[x19]
00b9d164	ldr x8,[x25, #0x28]
00b9d168	ldr x9,[sp, #0x48]
00b9d16c	cmp x8,x9
00b9d170	b.ne 0x00b9d258
00b9d174	mov w0,w22
00b9d178	ldp x29,x30,[sp, #0x90]
00b9d17c	ldp x20,x19,[sp, #0x80]
00b9d180	ldp x22,x21,[sp, #0x70]
00b9d184	ldp x24,x23,[sp, #0x60]
00b9d188	ldr x25,[sp, #0x50]
00b9d18c	add sp,sp,#0xa0
00b9d190	ret
00b9d194	lsl x22,x8,#0x3
00b9d198	adrp x8,0xcab000
00b9d19c	adrp x9,0x787000
00b9d1a0	add x8,x8,#0x3d0
00b9d1a4	add x9,x9,#0x4f0
00b9d1a8	ldr x1,[x8, x22#0x0]
00b9d1ac	ldr x2,[x9, x22#0x0]
00b9d1b0	add x0,sp,#0x8
00b9d1b4	bl 0x00c41ca0
00b9d1b8	cbnz w0,0x00b9d1d8
00b9d1bc	adrp x8,0xcab000
00b9d1c0	add x8,x8,#0x410
00b9d1c4	ldr x1,[x8, x22#0x0]
00b9d1c8	add x0,sp,#0x28
00b9d1cc	mov w2,#0x1
00b9d1d0	bl 0x00c41ca0
00b9d1d4	cbz w0,0x00b9d1f0
00b9d1d8	bl 0x00c42bf0
00b9d1dc	mov w22,w0
00b9d1e0	cbz w0,0x00b9d1f0
00b9d1e4	mov w19,wzr
00b9d1e8	mov w21,#0xffffff92
00b9d1ec	b 0x00b9d104
00b9d1f0	add x0,sp,#0x18
00b9d1f4	mov x1,x24
00b9d1f8	mov x2,x21
00b9d1fc	bl 0x00c41ca0
00b9d200	mov w21,w0
00b9d204	cbnz w0,0x00b9d240
00b9d208	add x0,sp,#0x38
00b9d20c	add x1,sp,#0x28
00b9d210	add x2,sp,#0x18
00b9d214	add x3,sp,#0x8
00b9d218	mov x4,xzr
00b9d21c	bl 0x00c41b80
00b9d220	mov w21,w0
00b9d224	cbnz w0,0x00b9d240
00b9d228	add x0,sp,#0x38
00b9d22c	mov x1,x20
00b9d230	mov x2,x23
00b9d234	bl 0x00c41d80
00b9d238	mov w21,w0
00b9d23c	cbz w0,0x00b9d24c
00b9d240	mov w22,wzr
00b9d244	mov w19,#0x1
00b9d248	b 0x00b9d104
00b9d24c	mov w22,wzr
00b9d250	str x23,[x19]
00b9d254	b 0x00b9d244
00b9d258	bl 0x00c2fec0
