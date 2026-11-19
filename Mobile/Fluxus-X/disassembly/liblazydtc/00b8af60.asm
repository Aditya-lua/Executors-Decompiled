; psa_cipher_finish @ 00b8af60
00b8af60	stp x26,x25,[sp, #-0x50]!
00b8af64	stp x24,x23,[sp, #0x10]
00b8af68	stp x22,x21,[sp, #0x20]
00b8af6c	stp x20,x19,[sp, #0x30]
00b8af70	stp x29,x30,[sp, #0x40]
00b8af74	add x29,sp,#0x40
00b8af78	ldr w26,[x0]
00b8af7c	mov x24,x3
00b8af80	mov x23,x2
00b8af84	mov x22,x0
00b8af88	mov x19,x1
00b8af8c	cbz w26,0x00b8afbc
00b8af90	ldrb w8,[x22, #0x4]
00b8af94	and w8,w8,#0x3
00b8af98	cmp w8,#0x1
00b8af9c	b.ne 0x00b8afc8
00b8afa0	mov x19,xzr
00b8afa4	mov x20,xzr
00b8afa8	mov x21,xzr
00b8afac	mov w23,#0xffffff77
00b8afb0	str xzr,[x24]
00b8afb4	cbnz w26,0x00b8b04c
00b8afb8	b 0x00b8b06c
00b8afbc	str xzr,[x24]
00b8afc0	mov w23,#0xffffff77
00b8afc4	b 0x00b8b098
00b8afc8	cbz x23,0x00b8b02c
00b8afcc	mov w1,#0x1
00b8afd0	mov x0,x23
00b8afd4	bl 0x00c30a30
00b8afd8	mov x20,x0
00b8afdc	mov x21,x23
00b8afe0	cbz x0,0x00b8b0b4
00b8afe4	cmp w26,#0x1
00b8afe8	b.ne 0x00b8b040
00b8afec	add x25,x22,#0x8
00b8aff0	mov x0,x25
00b8aff4	mov x1,x20
00b8aff8	mov x2,x23
00b8affc	mov x3,x24
00b8b000	bl 0x00c42ec0
00b8b004	ldr w26,[x22]
00b8b008	mov w23,w0
00b8b00c	cbnz w0,0x00b8b044
00b8b010	cbz w26,0x00b8b0cc
00b8b014	cmp w26,#0x1
00b8b018	b.ne 0x00b8b024
00b8b01c	mov x0,x25
00b8b020	bl 0x00c42e70
00b8b024	mov w23,wzr
00b8b028	b 0x00b8b05c
00b8b02c	mov x21,xzr
00b8b030	mov x20,xzr
00b8b034	mov x19,xzr
00b8b038	cmp w26,#0x1
00b8b03c	b.eq 0x00b8afec
00b8b040	mov w23,#0xffffff79
00b8b044	str xzr,[x24]
00b8b048	cbz w26,0x00b8b06c
00b8b04c	cmp w26,#0x1
00b8b050	b.ne 0x00b8b05c
00b8b054	add x0,x22,#0x8
00b8b058	bl 0x00c42e70
00b8b05c	ldrb w8,[x22, #0x4]
00b8b060	str wzr,[x22]
00b8b064	and w8,w8,#0xfc
00b8b068	strb w8,[x22, #0x4]
00b8b06c	cbz x20,0x00b8b098
00b8b070	cbz x19,0x00b8b094
00b8b074	cbz x21,0x00b8b088
00b8b078	mov x0,x19
00b8b07c	mov x1,x20
00b8b080	mov x2,x21
00b8b084	bl 0x00c2ffd0
00b8b088	mov x0,x20
00b8b08c	bl 0x00c30960
00b8b090	b 0x00b8b098
00b8b094	mov w23,#0xffffff69
00b8b098	mov w0,w23
00b8b09c	ldp x29,x30,[sp, #0x40]
00b8b0a0	ldp x20,x19,[sp, #0x30]
00b8b0a4	ldp x22,x21,[sp, #0x20]
00b8b0a8	ldp x24,x23,[sp, #0x10]
00b8b0ac	ldp x26,x25,[sp], #0x50
00b8b0b0	ret
00b8b0b4	mov x19,xzr
00b8b0b8	mov x21,xzr
00b8b0bc	mov w23,#0xffffff73
00b8b0c0	str xzr,[x24]
00b8b0c4	cbnz w26,0x00b8b04c
00b8b0c8	b 0x00b8b06c
00b8b0cc	mov w23,w26
00b8b0d0	cbnz x20,0x00b8b070
00b8b0d4	b 0x00b8b098
