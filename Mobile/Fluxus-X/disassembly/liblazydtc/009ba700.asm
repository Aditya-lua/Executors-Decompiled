; FUN_009ba700 @ 009ba700
009ba700	stp x20,x19,[sp, #-0x20]!
009ba704	stp x29,x30,[sp, #0x10]
009ba708	mov x20,x0
009ba70c	ldr x0,[x0, #0x18]
009ba710	mov x19,x1
009ba714	add x29,sp,#0x10
009ba718	cbz x0,0x009ba74c
009ba71c	mov x1,x19
009ba720	bl 0x00c32770
009ba724	ldr x8,[x20, #0x20]
009ba728	cbz x8,0x009ba738
009ba72c	mov x0,x8
009ba730	mov x1,x19
009ba734	bl 0x00c35aa0
009ba738	ldp x29,x30,[sp, #0x10]
009ba73c	cmp w0,#0x0
009ba740	cset w0,gt
009ba744	ldp x20,x19,[sp], #0x20
009ba748	ret
009ba74c	mov w0,#0x1
009ba750	ldr x8,[x20, #0x20]
009ba754	cbnz x8,0x009ba72c
009ba758	b 0x009ba738
