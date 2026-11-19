; FUN_009ebf0c @ 009ebf0c
009ebf0c	stp x22,x21,[sp, #-0x30]!
009ebf10	stp x20,x19,[sp, #0x10]
009ebf14	stp x29,x30,[sp, #0x20]
009ebf18	ldr x9,[x0, #0x8]
009ebf1c	ldr x10,[x0, #0x918]
009ebf20	mov x21,x3
009ebf24	mov w22,w2
009ebf28	ldr x8,[x9, #0xc0]
009ebf2c	mov x19,x0
009ebf30	mov x20,x1
009ebf34	add x29,sp,#0x20
009ebf38	ldrb w11,[x8, #0x60]
009ebf3c	ldr x8,[x10, #0x2d8]
009ebf40	tbnz w11,#0x3,0x009ebf6c
009ebf44	ldr w9,[x9]
009ebf48	cmp w9,#0x304
009ebf4c	b.lt 0x009ebf6c
009ebf50	cmp w9,#0x10, LSL #12
009ebf54	b.eq 0x009ebf6c
009ebf58	mov w9,#0x3a80
009ebf5c	movk w9,#0x9, LSL #16
009ebf60	cmp x8,x9
009ebf64	csel x8,x8,x9,lt
009ebf68	b 0x009ebf78
009ebf6c	ldr w9,[x19, #0x4d0]
009ebf70	cmp w9,#0x0
009ebf74	csel x8,x8,xzr,eq
009ebf78	and x1,x8,#0xffffffff
009ebf7c	mov w2,#0x4
009ebf80	mov x0,x20
009ebf84	bl 0x00c343a0
009ebf88	cbz w0,0x009ebff4
009ebf8c	ldr x8,[x19, #0x8]
009ebf90	ldr x9,[x8, #0xc0]
009ebf94	ldrb w9,[x9, #0x60]
009ebf98	tbnz w9,#0x3,0x009ebfdc
009ebf9c	ldr w8,[x8]
009ebfa0	cmp w8,#0x304
009ebfa4	b.lt 0x009ebfdc
009ebfa8	cmp w8,#0x10, LSL #12
009ebfac	b.eq 0x009ebfdc
009ebfb0	mov w1,w22
009ebfb4	mov w2,#0x4
009ebfb8	mov x0,x20
009ebfbc	bl 0x00c343a0
009ebfc0	cbz w0,0x009ec02c
009ebfc4	mov w2,#0x8
009ebfc8	mov w3,#0x1
009ebfcc	mov x0,x20
009ebfd0	mov x1,x21
009ebfd4	bl 0x00c36f70
009ebfd8	cbz w0,0x009ec02c
009ebfdc	mov w1,#0x2
009ebfe0	mov x0,x20
009ebfe4	bl 0x00c343b0
009ebfe8	cbz w0,0x009ec010
009ebfec	mov w0,#0x1
009ebff0	b 0x009ec064
009ebff4	bl 0x00c342a0
009ebff8	adrp x0,0x2bd000
009ebffc	adrp x2,0x2b5000
009ec000	add x0,x0,#0x74c
009ec004	add x2,x2,#0xa17
009ec008	mov w1,#0xe39
009ec00c	b 0x009ec044
009ec010	bl 0x00c342a0
009ec014	adrp x0,0x2bd000
009ec018	adrp x2,0x2b5000
009ec01c	add x0,x0,#0x74c
009ec020	add x2,x2,#0xa17
009ec024	mov w1,#0xe47
009ec028	b 0x009ec044
009ec02c	bl 0x00c342a0
009ec030	adrp x0,0x2bd000
009ec034	adrp x2,0x2b5000
009ec038	add x0,x0,#0x74c
009ec03c	add x2,x2,#0xa17
009ec040	mov w1,#0xe40
009ec044	bl 0x00c342b0
009ec048	mov w2,#0x103
009ec04c	mov w1,#0x50
009ec050	movk w2,#0xc, LSL #16
009ec054	mov x0,x19
009ec058	mov x3,xzr
009ec05c	bl 0x00c34410
009ec060	mov w0,wzr
009ec064	ldp x29,x30,[sp, #0x20]
009ec068	ldp x20,x19,[sp, #0x10]
009ec06c	ldp x22,x21,[sp], #0x30
009ec070	ret
