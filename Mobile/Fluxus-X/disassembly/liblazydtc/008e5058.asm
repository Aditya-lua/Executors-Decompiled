; FUN_008e5058 @ 008e5058
008e5058	str x30,[sp, #-0x10]!
008e505c	ldp x8,x1,[x0, #0x8]
008e5060	add x2,sp,#0x8
008e5064	ldr x9,[x8]
008e5068	mov x0,x8
008e506c	ldr x9,[x9, #0x30]
008e5070	blr x9
008e5074	ldr x0,[sp, #0x8]
008e5078	ldr x30,[sp], #0x10
008e507c	ret
