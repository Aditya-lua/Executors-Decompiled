; ASN1_STRING_print @ 009ecf70
009ecf70	sub sp,sp,#0x90
009ecf74	stp x24,x23,[sp, #0x50]
009ecf78	stp x22,x21,[sp, #0x60]
009ecf7c	stp x20,x19,[sp, #0x70]
009ecf80	stp x29,x30,[sp, #0x80]
009ecf84	add x29,sp,#0x80
009ecf88	cbz x1,0x009ed03c
009ecf8c	ldr w8,[x1]
009ecf90	mov x20,x1
009ecf94	cmp w8,#0x1
009ecf98	b.lt 0x009ed034
009ecf9c	ldr x22,[x20, #0x8]
009ecfa0	mov x19,x0
009ecfa4	mov x21,xzr
009ecfa8	mov w2,wzr
009ecfac	mov x23,sp
009ecfb0	mov w24,#0x2e
009ecfb4	ldrb w9,[x22, x21]
009ecfb8	cmp w9,#0x7e
009ecfbc	b.ls 0x009ecfc8
009ecfc0	mov w9,#0x2e
009ecfc4	b 0x009ecfe0
009ecfc8	cmp w9,#0x1f
009ecfcc	b.hi 0x009ecfe0
009ecfd0	cmp w9,#0xa
009ecfd4	csel w10,w9,w24,eq
009ecfd8	cmp w9,#0xd
009ecfdc	csel w9,w9,w10,eq
009ecfe0	strb w9,[x23, w2, SXTW ]
009ecfe4	cmp w2,#0x4f
009ecfe8	add w2,w2,#0x1
009ecfec	b.lt 0x009ed00c
009ecff0	mov x1,sp
009ecff4	mov x0,x19
009ecff8	bl 0x00c34240
009ecffc	cmp w0,#0x1
009ed000	b.lt 0x009ed03c
009ed004	ldr w8,[x20]
009ed008	mov w2,wzr
009ed00c	add x21,x21,#0x1
009ed010	cmp x21,w8, SXTW 
009ed014	b.lt 0x009ecfb4
009ed018	cmp w2,#0x1
009ed01c	b.lt 0x009ed034
009ed020	mov x1,sp
009ed024	mov x0,x19
009ed028	bl 0x00c34240
009ed02c	cmp w0,#0x1
009ed030	b.lt 0x009ed03c
009ed034	mov w0,#0x1
009ed038	b 0x009ed040
009ed03c	mov w0,wzr
009ed040	ldp x29,x30,[sp, #0x80]
009ed044	ldp x20,x19,[sp, #0x70]
009ed048	ldp x22,x21,[sp, #0x60]
009ed04c	ldp x24,x23,[sp, #0x50]
009ed050	add sp,sp,#0x90
009ed054	ret
