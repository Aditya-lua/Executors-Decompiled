; curl_slist_free_all @ 0093f8bc
0093f8bc	str x21,[sp, #-0x30]!
0093f8c0	stp x20,x19,[sp, #0x10]
0093f8c4	stp x29,x30,[sp, #0x20]
0093f8c8	add x29,sp,#0x20
0093f8cc	mov x19,x0
0093f8d0	cbz x0,0x0093f900
0093f8d4	adrp x20,0xcc4000
0093f8d8	add x20,x20,#0x678
0093f8dc	ldp x0,x21,[x19]
0093f8e0	ldr x8,[x20]
0093f8e4	blr x8
0093f8e8	str xzr,[x19]
0093f8ec	ldr x8,[x20]
0093f8f0	mov x0,x19
0093f8f4	blr x8
0093f8f8	mov x19,x21
0093f8fc	cbnz x21,0x0093f8dc
0093f900	ldp x29,x30,[sp, #0x20]
0093f904	ldp x20,x19,[sp, #0x10]
0093f908	ldr x21,[sp], #0x30
0093f90c	ret
