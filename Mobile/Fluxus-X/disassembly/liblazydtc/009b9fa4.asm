; FUN_009b9fa4 @ 009b9fa4
009b9fa4	str x23,[sp, #-0x40]!
009b9fa8	stp x22,x21,[sp, #0x10]
009b9fac	stp x20,x19,[sp, #0x20]
009b9fb0	stp x29,x30,[sp, #0x30]
009b9fb4	add x29,sp,#0x30
009b9fb8	cbz x1,0x009ba034
009b9fbc	adrp x19,0xc56000
009b9fc0	mov x20,x1
009b9fc4	mov x21,x0
009b9fc8	mov x22,xzr
009b9fcc	add x19,x19,#0x950
009b9fd0	ldrh w8,[x19, #0x18]
009b9fd4	ldr w23,[x21]
009b9fd8	tbz w8,#0x3,0x009b9fe0
009b9fdc	tbz w23,#0x3,0x009ba024
009b9fe0	tbz w8,#0x2,0x009b9fe8
009b9fe4	tbz w23,#0x2,0x009ba024
009b9fe8	lsr w9,w23,#0x5
009b9fec	orn w8,w9,w8, LSR #0x5
009b9ff0	tbz w8,#0x0,0x009ba024
009b9ff4	tbz w23,#0x0,0x009ba00c
009b9ff8	ldr x0,[x19, #0x10]
009b9ffc	cbz x0,0x009ba00c
009ba000	mov x1,x20
009ba004	bl 0x00c301f0
009ba008	cbz w0,0x009ba038
009ba00c	tbz w23,#0x1,0x009ba024
009ba010	ldr x0,[x19, #0x8]
009ba014	cbz x0,0x009ba024
009ba018	mov x1,x20
009ba01c	bl 0x00c35ee0
009ba020	cbz w0,0x009ba038
009ba024	add x22,x22,#0x1
009ba028	cmp x22,#0x36
009ba02c	add x19,x19,#0x20
009ba030	b.cc 0x009b9fd0
009ba034	mov x19,xzr
009ba038	mov x0,x19
009ba03c	ldp x29,x30,[sp, #0x30]
009ba040	ldp x20,x19,[sp, #0x20]
009ba044	ldp x22,x21,[sp, #0x10]
009ba048	ldr x23,[sp], #0x40
009ba04c	ret
