; cpr::Session::SetOption @ 008f304c
008f304c	stp x20,x19,[sp, #-0x20]!
008f3050	stp x29,x30,[sp, #0x10]
008f3054	add x29,sp,#0x10
008f3058	mov w8,#0x1
008f305c	ldr x9,[x0, #0x18]
008f3060	strb w8,[x0, #0x10]
008f3064	ldrb w8,[x1, #0x8]
008f3068	ldr x10,[x1, #0x10]
008f306c	mov x20,x0
008f3070	ldr x0,[x9]
008f3074	lsr w9,w8,#0x1
008f3078	tst w8,#0x1
008f307c	mov x19,x1
008f3080	csel x2,x9,x10,eq
008f3084	mov w1,#0x75a8
008f3088	bl 0x00c317c0
008f308c	ldr x8,[x20, #0x18]
008f3090	ldrb w9,[x19, #0x8]
008f3094	ldr x10,[x19, #0x18]
008f3098	ldp x29,x30,[sp, #0x10]
008f309c	ldr x0,[x8]
008f30a0	add x8,x19,#0x9
008f30a4	tst w9,#0x1
008f30a8	csel x2,x8,x10,eq
008f30ac	mov w1,#0x271f
008f30b0	ldp x20,x19,[sp], #0x20
008f30b4	b 0x00c317c0
