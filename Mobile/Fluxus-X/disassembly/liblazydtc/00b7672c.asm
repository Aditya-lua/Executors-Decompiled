; mbedtls_entropy_write_seed_file @ 00b7672c
00b7672c	sub sp,sp,#0x80
00b76730	str x21,[sp, #0x50]
00b76734	stp x20,x19,[sp, #0x60]
00b76738	stp x29,x30,[sp, #0x70]
00b7673c	add x29,sp,#0x70
00b76740	mrs x21,tpidr_el0
00b76744	ldr x8,[x21, #0x28]
00b76748	mov x19,x1
00b7674c	add x1,sp,#0x8
00b76750	mov w2,#0x40
00b76754	stur x8,[x29, #-0x28]
00b76758	bl 0x00c30380
00b7675c	cbz w0,0x00b76774
00b76760	mov w19,#0xffffffc4
00b76764	add x0,sp,#0x8
00b76768	mov w1,#0x40
00b7676c	bl 0x00c42220
00b76770	b 0x00b767cc
00b76774	adrp x1,0x2a6000
00b76778	add x1,x1,#0xd85
00b7677c	mov x0,x19
00b76780	bl 0x00c30c10
00b76784	mov x20,x0
00b76788	orr w19,wzr,#0xffffffc1
00b7678c	cbz x0,0x00b76764
00b76790	mov x0,x20
00b76794	mov x1,xzr
00b76798	bl 0x00c42490
00b7679c	add x0,sp,#0x8
00b767a0	mov w1,#0x1
00b767a4	mov w2,#0x40
00b767a8	mov x3,x20
00b767ac	bl 0x00c308f0
00b767b0	cmp x0,#0x40
00b767b4	add x0,sp,#0x8
00b767b8	mov w1,#0x40
00b767bc	csel w19,wzr,w19,eq
00b767c0	bl 0x00c42220
00b767c4	mov x0,x20
00b767c8	bl 0x00c30be0
00b767cc	ldr x8,[x21, #0x28]
00b767d0	ldur x9,[x29, #-0x28]
00b767d4	cmp x8,x9
00b767d8	b.ne 0x00b767f4
00b767dc	mov w0,w19
00b767e0	ldp x29,x30,[sp, #0x70]
00b767e4	ldp x20,x19,[sp, #0x60]
00b767e8	ldr x21,[sp, #0x50]
00b767ec	add sp,sp,#0x80
00b767f0	ret
00b767f4	bl 0x00c2fec0
