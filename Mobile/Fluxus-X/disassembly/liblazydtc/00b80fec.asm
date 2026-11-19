; mbedtls_mpi_random @ 00b80fec
00b80fec	str x23,[sp, #-0x40]!
00b80ff0	stp x22,x21,[sp, #0x10]
00b80ff4	stp x20,x19,[sp, #0x20]
00b80ff8	stp x29,x30,[sp, #0x30]
00b80ffc	add x29,sp,#0x30
00b81000	mov x19,x4
00b81004	mov x20,x3
00b81008	mov x22,x2
00b8100c	mov x21,x1
00b81010	mov x23,x0
00b81014	tbnz x1,#0x3f,0x00b810ec
00b81018	ldrh w1,[x22, #0xa]
00b8101c	sub x8,x1,#0x1
00b81020	cmn x8,#0x1
00b81024	b.eq 0x00b81040
00b81028	ldr x9,[x22]
00b8102c	ldr x9,[x9, x8, LSL #0x3]
00b81030	sub x8,x8,#0x1
00b81034	cbz x9,0x00b81020
00b81038	add x8,x8,#0x2
00b8103c	b 0x00b81044
00b81040	mov x8,xzr
00b81044	mov w9,#0x2
00b81048	subs x9,x9,#0x1
00b8104c	b.eq 0x00b81054
00b81050	cbz x21,0x00b81048
00b81054	orr x10,x9,x8
00b81058	cbz x10,0x00b810ec
00b8105c	cmp x8,x9
00b81060	b.ls 0x00b810a8
00b81064	ldrsh w9,[x22, #0x8]
00b81068	cmp w9,#0x1
00b8106c	b.lt 0x00b810ec
00b81070	mov x0,x23
00b81074	bl 0x00b7ea70
00b81078	cbnz w0,0x00b810f0
00b8107c	ldr x0,[x23]
00b81080	ldr x2,[x22]
00b81084	ldrh w3,[x23, #0xa]
00b81088	mov x1,x21
00b8108c	mov x4,x20
00b81090	mov x5,x19
00b81094	ldp x29,x30,[sp, #0x30]
00b81098	ldp x20,x19,[sp, #0x20]
00b8109c	ldp x22,x21,[sp, #0x10]
00b810a0	ldr x23,[sp], #0x40
00b810a4	b 0x00c41eb0
00b810a8	cmp x9,x8
00b810ac	b.hi 0x00b810ec
00b810b0	ldrsh w9,[x22, #0x8]
00b810b4	tbnz w9,#0x1f,0x00b810ec
00b810b8	sub x8,x8,#0x1
00b810bc	cmn x8,#0x1
00b810c0	b.eq 0x00b810ec
00b810c4	ldr x10,[x22]
00b810c8	ldr x10,[x10, x8, LSL #0x3]
00b810cc	cmp x10,x21
00b810d0	b.hi 0x00b81068
00b810d4	cmp x10,x21
00b810d8	sub x8,x8,#0x1
00b810dc	b.cs 0x00b810bc
00b810e0	neg w9,w9
00b810e4	cmp w9,#0x1
00b810e8	b.ge 0x00b81070
00b810ec	orr w0,wzr,#0xfffffffc
00b810f0	ldp x29,x30,[sp, #0x30]
00b810f4	ldp x20,x19,[sp, #0x20]
00b810f8	ldp x22,x21,[sp, #0x10]
00b810fc	ldr x23,[sp], #0x40
00b81100	ret
