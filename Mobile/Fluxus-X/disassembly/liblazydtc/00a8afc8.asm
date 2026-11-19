; FUN_00a8afc8 @ 00a8afc8
00a8afc8	sub sp,sp,#0x60
00a8afcc	stp x26,x25,[sp, #0x10]
00a8afd0	stp x24,x23,[sp, #0x20]
00a8afd4	stp x22,x21,[sp, #0x30]
00a8afd8	stp x20,x19,[sp, #0x40]
00a8afdc	stp x29,x30,[sp, #0x50]
00a8afe0	add x29,sp,#0x50
00a8afe4	cbz x3,0x00a8b07c
00a8afe8	adrp x25,0xcb5000
00a8afec	ldr x25,[x25, #0x318]
00a8aff0	lsr x8,x3,#0x1e
00a8aff4	mov w9,#0x40000000
00a8aff8	cmp x8,#0x0
00a8affc	mov x19,x3
00a8b000	mov x20,x2
00a8b004	mov x21,x1
00a8b008	mov x22,x0
00a8b00c	add x23,x0,#0x28
00a8b010	csel x24,x3,x9,eq
00a8b014	mov x0,x22
00a8b018	bl 0x00c3ceb0
00a8b01c	str w0,[sp, #0xc]
00a8b020	mov x0,x22
00a8b024	bl 0x00c3cea0
00a8b028	mov x26,x0
00a8b02c	mov x0,x22
00a8b030	bl 0x00c3cec0
00a8b034	mov w6,w0
00a8b038	add x5,sp,#0xc
00a8b03c	mov x0,x20
00a8b040	mov x1,x21
00a8b044	mov x2,x24
00a8b048	mov x3,x26
00a8b04c	mov x4,x23
00a8b050	mov x7,x25
00a8b054	bl 0x00c3e2f0
00a8b058	ldr w1,[sp, #0xc]
00a8b05c	mov x0,x22
00a8b060	bl 0x00c3ced0
00a8b064	sub x19,x19,x24
00a8b068	cmp x19,x24
00a8b06c	add x20,x20,x24
00a8b070	add x21,x21,x24
00a8b074	csel x24,x19,x24,cc
00a8b078	cbnz x19,0x00a8b014
00a8b07c	ldp x29,x30,[sp, #0x50]
00a8b080	ldp x20,x19,[sp, #0x40]
00a8b084	ldp x22,x21,[sp, #0x30]
00a8b088	ldp x24,x23,[sp, #0x20]
00a8b08c	ldp x26,x25,[sp, #0x10]
00a8b090	mov w0,#0x1
00a8b094	add sp,sp,#0x60
00a8b098	ret
