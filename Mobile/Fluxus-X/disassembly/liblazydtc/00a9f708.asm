; OSSL_PARAM_construct_utf8_string @ 00a9f708
00a9f708	str x21,[sp, #-0x30]!
00a9f70c	stp x20,x19,[sp, #0x10]
00a9f710	mov x20,x1
00a9f714	mov x21,x0
00a9f718	mov x19,x8
00a9f71c	stp x29,x30,[sp, #0x20]
00a9f720	add x29,sp,#0x20
00a9f724	cbz x1,0x00a9f738
00a9f728	cbnz x2,0x00a9f738
00a9f72c	mov x0,x20
00a9f730	bl 0x00c2ff50
00a9f734	mov x2,x0
00a9f738	mov w8,#0x4
00a9f73c	mov x9,#-0x1
00a9f740	str x21,[x19]
00a9f744	stp x20,x2,[x19, #0x10]
00a9f748	str w8,[x19, #0x8]
00a9f74c	str x9,[x19, #0x20]
00a9f750	ldp x29,x30,[sp, #0x20]
00a9f754	ldp x20,x19,[sp, #0x10]
00a9f758	ldr x21,[sp], #0x30
00a9f75c	ret
