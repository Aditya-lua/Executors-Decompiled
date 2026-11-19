; evp_pkey_ctx_set1_id_prov @ 00a76f74
00a76f74	sub sp,sp,#0xb0
00a76f78	stp x20,x19,[sp, #0x90]
00a76f7c	stp x29,x30,[sp, #0xa0]
00a76f80	ldr w8,[x0]
00a76f84	mov x19,x0
00a76f88	str x21,[sp, #0x80]
00a76f8c	add x29,sp,#0xa0
00a76f90	sub w9,w8,#0x10
00a76f94	cmp w9,#0x30
00a76f98	b.hi 0x00a76fb4
00a76f9c	mov w10,#0x1
00a76fa0	lsl x9,x10,x9
00a76fa4	mov x10,#0x1000000010000
00a76fa8	movk x10,#0x1
00a76fac	tst x9,x10
00a76fb0	b.ne 0x00a76fc4
00a76fb4	cmp w8,#0x80
00a76fb8	b.eq 0x00a76fc4
00a76fbc	cmp w8,#0x100
00a76fc0	b.ne 0x00a77074
00a76fc4	adrp x0,0x2b7000
00a76fc8	sxtw x2,w2
00a76fcc	add x0,x0,#0xd12
00a76fd0	add x8,sp,#0x8
00a76fd4	bl 0x00c34c50
00a76fd8	ldr x8,[sp, #0x28]
00a76fdc	ldur q0,[sp, #0x18]
00a76fe0	ldur q1,[sp, #0x8]
00a76fe4	str x8,[sp, #0x50]
00a76fe8	add x8,sp,#0x8
00a76fec	stp q1,q0,[sp, #0x30]
00a76ff0	bl 0x00c34c40
00a76ff4	ldr x8,[sp, #0x28]
00a76ff8	ldur q0,[sp, #0x18]
00a76ffc	ldur q1,[sp, #0x8]
00a77000	str x8,[sp, #0x78]
00a77004	stur q0,[sp, #0x68]
00a77008	stur q1,[sp, #0x58]
00a7700c	ldr x8,[x19, #0x20]
00a77010	cbz x8,0x00a77044
00a77014	mov x0,x19
00a77018	bl 0x00a75fe0
00a7701c	ldr x1,[sp, #0x30]
00a77020	cbz x1,0x00a77044
00a77024	add x8,sp,#0x30
00a77028	mov x20,x0
00a7702c	add x21,x8,#0x28
00a77030	mov x0,x20
00a77034	bl 0x00c36530
00a77038	cbz x0,0x00a77058
00a7703c	ldr x1,[x21], #0x28
00a77040	cbnz x1,0x00a77030
00a77044	add x1,sp,#0x30
00a77048	mov x0,x19
00a7704c	bl 0x00a75c0c
00a77050	cmn w0,#0x2
00a77054	b.ne 0x00a770a4
00a77058	bl 0x00c342a0
00a7705c	adrp x0,0x2c3000
00a77060	adrp x2,0x2aa000
00a77064	add x0,x0,#0xa9f
00a77068	add x2,x2,#0x252
00a7706c	mov w1,#0x515
00a77070	b 0x00a7708c
00a77074	bl 0x00c342a0
00a77078	adrp x0,0x2c3000
00a7707c	adrp x2,0x2aa000
00a77080	add x0,x0,#0xa9f
00a77084	add x2,x2,#0x252
00a77088	mov w1,#0x506
00a7708c	bl 0x00c342b0
00a77090	orr w0,wzr,#0x6
00a77094	mov w1,#0x93
00a77098	mov x2,xzr
00a7709c	bl 0x00c342c0
00a770a0	orr w0,wzr,#0xfffffffe
00a770a4	ldp x29,x30,[sp, #0xa0]
00a770a8	ldp x20,x19,[sp, #0x90]
00a770ac	ldr x21,[sp, #0x80]
00a770b0	add sp,sp,#0xb0
00a770b4	ret
