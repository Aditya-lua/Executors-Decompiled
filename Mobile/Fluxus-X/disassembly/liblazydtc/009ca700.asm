; RECORD_LAYER_clear @ 009ca700
009ca700	str x19,[sp, #-0x20]!
009ca704	stp x29,x30,[sp, #0x10]
009ca708	mov x19,x0
009ca70c	orr w8,wzr,#0xf0
009ca710	str xzr,[x0, #0x1070]
009ca714	str xzr,[x0, #0x1080]
009ca718	str wzr,[x0, #0x1088]
009ca71c	add x0,x0,#0x20
009ca720	movi v0.2D,#0x0
009ca724	mov w9,#0x1058
009ca728	add x29,sp,#0x10
009ca72c	str wzr,[x19, #0x1068]
009ca730	str xzr,[x19, #0x1050]
009ca734	str w8,[x19, #0xc]
009ca738	str q0,[x19,x9]
009ca73c	str q0,[x19, #0x1090]
009ca740	bl 0x00c36c10
009ca744	ldr x0,[x19]
009ca748	bl 0x00c36ce0
009ca74c	add x0,x19,#0x650
009ca750	mov w1,#0x20
009ca754	str xzr,[x19, #0x10]
009ca758	bl 0x00c36c20
009ca75c	ldr x8,[x19, #0x10b8]
009ca760	movi v0.2D,#0x0
009ca764	str q0,[x19, #0x10a0]
009ca768	cbz x8,0x009ca77c
009ca76c	ldp x29,x30,[sp, #0x10]
009ca770	mov x0,x19
009ca774	ldr x19,[sp], #0x20
009ca778	b 0x00c34260
009ca77c	ldp x29,x30,[sp, #0x10]
009ca780	ldr x19,[sp], #0x20
009ca784	ret
