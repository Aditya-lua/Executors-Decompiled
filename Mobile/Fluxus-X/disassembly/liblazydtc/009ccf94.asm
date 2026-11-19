; early_data_count_ok @ 009ccf94
009ccf94	stp x20,x19,[sp, #-0x20]!
009ccf98	stp x29,x30,[sp, #0x10]
009ccf9c	ldr w8,[x0, #0x38]
009ccfa0	ldr x9,[x0, #0x918]
009ccfa4	mov w20,w3
009ccfa8	mov x19,x0
009ccfac	add x29,sp,#0x10
009ccfb0	cbz w8,0x009ccff0
009ccfb4	ldr w10,[x19, #0xb30]
009ccfb8	ldr w8,[x19, #0x1d44]
009ccfbc	cmp w10,#0x2
009ccfc0	b.ne 0x009ccfd0
009ccfc4	ldr w9,[x9, #0x354]
009ccfc8	cmp w8,w9
009ccfcc	csel w8,w8,w9,cc
009ccfd0	cbnz w8,0x009ccff8
009ccfd4	bl 0x00c342a0
009ccfd8	adrp x0,0x2cf000
009ccfdc	adrp x2,0x2a9000
009ccfe0	add x0,x0,#0x7d6
009ccfe4	add x2,x2,#0xee0
009ccfe8	mov w1,#0x86
009ccfec	b 0x009cd024
009ccff0	ldr w8,[x9, #0x354]
009ccff4	cbz w8,0x009cd064
009ccff8	ldr w9,[x19, #0x1d48]
009ccffc	add w10,w8,w2
009cd000	add x8,x9,x1
009cd004	cmp x8,x10
009cd008	b.ls 0x009cd050
009cd00c	bl 0x00c342a0
009cd010	adrp x0,0x2cf000
009cd014	adrp x2,0x2a9000
009cd018	add x0,x0,#0x7d6
009cd01c	add x2,x2,#0xee0
009cd020	mov w1,#0x8f
009cd024	bl 0x00c342b0
009cd028	cmp w20,#0x0
009cd02c	mov w8,#0x50
009cd030	mov w9,#0xa
009cd034	csel w1,w9,w8,eq
009cd038	mov w2,#0xa4
009cd03c	mov x0,x19
009cd040	mov x3,xzr
009cd044	bl 0x00c34410
009cd048	mov w0,wzr
009cd04c	b 0x009cd058
009cd050	mov w0,#0x1
009cd054	str w8,[x19, #0x1d48]
009cd058	ldp x29,x30,[sp, #0x10]
009cd05c	ldp x20,x19,[sp], #0x20
009cd060	ret
009cd064	ldr x8,[x19, #0x920]
009cd068	cbz x8,0x009cd074
009cd06c	ldr w8,[x8, #0x354]
009cd070	cbnz w8,0x009ccff8
009cd074	bl 0x00c342a0
009cd078	adrp x0,0x2cf000
009cd07c	adrp x2,0x2a9000
009cd080	add x0,x0,#0x7d6
009cd084	add x2,x2,#0xee0
009cd088	mov w1,#0x76
009cd08c	bl 0x00c342b0
009cd090	mov w2,#0x103
009cd094	mov w1,#0x50
009cd098	movk w2,#0xc, LSL #16
009cd09c	b 0x009cd03c
