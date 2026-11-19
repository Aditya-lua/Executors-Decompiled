; ossl_ffc_params_set0_pqg @ 00a7d018
00a7d018	stp x22,x21,[sp, #-0x30]!
00a7d01c	stp x20,x19,[sp, #0x10]
00a7d020	mov x19,x3
00a7d024	mov x21,x2
00a7d028	mov x20,x0
00a7d02c	stp x29,x30,[sp, #0x20]
00a7d030	add x29,sp,#0x20
00a7d034	cbz x1,0x00a7d050
00a7d038	ldr x0,[x20]
00a7d03c	mov x22,x1
00a7d040	cmp x0,x1
00a7d044	b.eq 0x00a7d050
00a7d048	bl 0x00c36290
00a7d04c	str x22,[x20]
00a7d050	cbz x21,0x00a7d068
00a7d054	ldr x0,[x20, #0x8]
00a7d058	cmp x0,x21
00a7d05c	b.eq 0x00a7d068
00a7d060	bl 0x00c36290
00a7d064	str x21,[x20, #0x8]
00a7d068	cbz x19,0x00a7d080
00a7d06c	ldr x0,[x20, #0x10]
00a7d070	cmp x0,x19
00a7d074	b.eq 0x00a7d080
00a7d078	bl 0x00c36290
00a7d07c	str x19,[x20, #0x10]
00a7d080	ldp x29,x30,[sp, #0x20]
00a7d084	ldp x20,x19,[sp, #0x10]
00a7d088	ldp x22,x21,[sp], #0x30
00a7d08c	ret
