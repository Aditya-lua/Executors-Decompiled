; ossl_statem_client_post_work @ 009db928
009db928	str x19,[sp, #-0x20]!
009db92c	stp x29,x30,[sp, #0x10]
009db930	ldr w8,[x0, #0x5c]
009db934	add x29,sp,#0x10
009db938	str xzr,[x0, #0x98]
009db93c	sub w8,w8,#0xc
009db940	cmp w8,#0x24
009db944	b.hi 0x009dbabc
009db948	adrp x9,0x74d000
009db94c	add x9,x9,#0x41c
009db950	ldrsw x8,[x9, x8, LSL #0x2]
009db954	mov x19,x0
009db958	add x8,x8,x9
009db95c	br x8
009db960	ldr w8,[x19, #0x84]
009db964	cmp w8,#0x2
009db968	b.ne 0x009dba98
009db96c	ldr w8,[x19, #0x1d40]
009db970	cbz w8,0x009dba98
009db974	ldrb w8,[x19, #0x9ea]
009db978	tbnz w8,#0x4,0x009dbaa4
009db97c	mov w1,#0x52
009db980	mov x0,x19
009db984	bl 0x00c366e0
009db988	cbnz w0,0x009dbaa4
009db98c	b 0x009dbac0
009db990	mov x0,x19
009db994	bl 0x009dbb44
009db998	cbnz w0,0x009dbabc
009db99c	b 0x009dbac0
009db9a0	ldr x9,[x19, #0x8]
009db9a4	ldr x8,[x9, #0xc0]
009db9a8	ldrb w10,[x8, #0x60]
009db9ac	tbnz w10,#0x3,0x009db9c4
009db9b0	ldr w9,[x9]
009db9b4	cmp w9,#0x304
009db9b8	b.lt 0x009db9c4
009db9bc	cmp w9,#0x10, LSL #12
009db9c0	b.ne 0x009dbabc
009db9c4	ldr w9,[x19, #0x8e8]
009db9c8	cmp w9,#0x1
009db9cc	b.eq 0x009dbabc
009db9d0	ldr w9,[x19, #0x84]
009db9d4	cmp w9,#0x2
009db9d8	b.ne 0x009dbadc
009db9dc	ldr w9,[x19, #0x1d40]
009db9e0	cbz w9,0x009dbadc
009db9e4	mov w1,#0x52
009db9e8	mov x0,x19
009db9ec	bl 0x00c366e0
009db9f0	cbnz w0,0x009dbabc
009db9f4	b 0x009dbac0
009db9f8	mov x0,x19
009db9fc	bl 0x00c35e60
009dba00	cmp w0,#0x1
009dba04	b.ne 0x009dbad4
009dba08	ldr x8,[x19, #0x8]
009dba0c	ldr x9,[x8, #0xc0]
009dba10	ldrb w9,[x9, #0x60]
009dba14	tbnz w9,#0x3,0x009dbabc
009dba18	ldr w8,[x8]
009dba1c	cmp w8,#0x304
009dba20	b.lt 0x009dbabc
009dba24	cmp w8,#0x10, LSL #12
009dba28	b.eq 0x009dbabc
009dba2c	mov x0,x19
009dba30	bl 0x00c371d0
009dba34	cbz w0,0x009dbac0
009dba38	ldr w8,[x19, #0xba8]
009dba3c	cmp w8,#0x4
009dba40	b.eq 0x009dbabc
009dba44	ldr x8,[x19, #0x8]
009dba48	mov w1,#0x112
009dba4c	mov x0,x19
009dba50	ldr x8,[x8, #0xc0]
009dba54	ldr x8,[x8, #0x20]
009dba58	blr x8
009dba5c	cbnz w0,0x009dbabc
009dba60	b 0x009dbac0
009dba64	mov x0,x19
009dba68	bl 0x00c35e60
009dba6c	cmp w0,#0x1
009dba70	b.ne 0x009dbacc
009dba74	mov w1,#0x1
009dba78	mov x0,x19
009dba7c	bl 0x00c36860
009dba80	cbnz w0,0x009dbabc
009dba84	b 0x009dbac0
009dba88	ldr x0,[x19, #0x878]
009dba8c	bl 0x00c342d0
009dba90	str xzr,[x19, #0x878]
009dba94	b 0x009dbabc
009dba98	mov x0,x19
009dba9c	bl 0x00c35e60
009dbaa0	cbz w0,0x009dbacc
009dbaa4	ldr x8,[x19, #0x8]
009dbaa8	ldr x8,[x8, #0xc0]
009dbaac	ldrb w8,[x8, #0x60]
009dbab0	tbz w8,#0x3,0x009dbabc
009dbab4	mov w8,#0x1
009dbab8	str w8,[x19, #0xa08]
009dbabc	mov w0,#0x2
009dbac0	ldp x29,x30,[sp, #0x10]
009dbac4	ldr x19,[sp], #0x20
009dbac8	ret
009dbacc	orr w0,wzr,#0x3
009dbad0	b 0x009dbac0
009dbad4	mov w0,#0x4
009dbad8	b 0x009dbac0
009dbadc	ldr x10,[x19, #0x2e0]
009dbae0	ldr x9,[x19, #0x918]
009dbae4	str x10,[x9, #0x2f8]
009dbae8	ldr x10,[x19, #0x340]
009dbaec	cbz x10,0x009dbaf4
009dbaf0	ldr w10,[x10]
009dbaf4	str w10,[x9, #0x2f4]
009dbaf8	ldr x8,[x8, #0x10]
009dbafc	mov x0,x19
009dbb00	blr x8
009dbb04	cbz w0,0x009dbac0
009dbb08	ldr x8,[x19, #0x8]
009dbb0c	mov w1,#0x12
009dbb10	mov x0,x19
009dbb14	ldr x8,[x8, #0xc0]
009dbb18	ldr x8,[x8, #0x20]
009dbb1c	blr x8
009dbb20	cbz w0,0x009dbac0
009dbb24	ldr x8,[x19, #0x8]
009dbb28	ldr x8,[x8, #0xc0]
009dbb2c	ldrb w8,[x8, #0x60]
009dbb30	tbz w8,#0x3,0x009dbabc
009dbb34	mov w1,#0x2
009dbb38	mov x0,x19
009dbb3c	bl 0x00c36b80
009dbb40	b 0x009dbabc
