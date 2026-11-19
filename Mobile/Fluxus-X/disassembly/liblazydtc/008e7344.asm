; cpr::Authentication::~Authentication @ 008e7344
008e7344	stp x20,x19,[sp, #-0x20]!
008e7348	stp x29,x30,[sp, #0x10]
008e734c	add x29,sp,#0x10
008e7350	mov x19,x0
008e7354	bl 0x00c30580
008e7358	ldrb w8,[x19]
008e735c	tbnz w8,#0x0,0x008e736c
008e7360	ldp x29,x30,[sp, #0x10]
008e7364	ldp x20,x19,[sp], #0x20
008e7368	ret
008e736c	ldr x0,[x19, #0x10]
008e7370	ldp x29,x30,[sp, #0x10]
008e7374	ldp x20,x19,[sp], #0x20
008e7378	b 0x00c301d0
