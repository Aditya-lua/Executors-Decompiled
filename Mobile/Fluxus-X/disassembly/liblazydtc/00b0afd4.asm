; X509_OBJECT_set1_X509_CRL @ 00b0afd4
00b0afd4	str x21,[sp, #-0x30]!
00b0afd8	stp x20,x19,[sp, #0x10]
00b0afdc	stp x29,x30,[sp, #0x20]
00b0afe0	add x29,sp,#0x20
00b0afe4	cbz x0,0x00b0b044
00b0afe8	mov x20,x0
00b0afec	mov x0,x1
00b0aff0	mov x19,x1
00b0aff4	bl 0x00c3f810
00b0aff8	cbz w0,0x00b0b044
00b0affc	ldr w8,[x20]
00b0b000	cmp w8,#0x1
00b0b004	b.eq 0x00b0b020
00b0b008	cmp w8,#0x2
00b0b00c	b.ne 0x00b0b030
00b0b010	mov x21,x20
00b0b014	ldr x0,[x21, #0x8]!
00b0b018	bl 0x00c382b0
00b0b01c	b 0x00b0b034
00b0b020	mov x21,x20
00b0b024	ldr x0,[x21, #0x8]!
00b0b028	bl 0x00c31a90
00b0b02c	b 0x00b0b034
00b0b030	add x21,x20,#0x8
00b0b034	mov w8,#0x2
00b0b038	mov w0,#0x1
00b0b03c	str w8,[x20]
00b0b040	str x19,[x21]
00b0b044	ldp x29,x30,[sp, #0x20]
00b0b048	ldp x20,x19,[sp, #0x10]
00b0b04c	ldr x21,[sp], #0x30
00b0b050	ret
