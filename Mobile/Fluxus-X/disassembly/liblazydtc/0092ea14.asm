; curl_multi_socket @ 0092ea14
0092ea14	str x19,[sp, #-0x20]!
0092ea18	stp x29,x30,[sp, #0x10]
0092ea1c	add x29,sp,#0x10
0092ea20	ldrb w8,[x0, #0x231]
0092ea24	mov x4,x2
0092ea28	mov x19,x0
0092ea2c	mov w2,w1
0092ea30	tbnz w8,#0x2,0x0092ea5c
0092ea34	mov x0,x19
0092ea38	mov w1,wzr
0092ea3c	mov w3,wzr
0092ea40	bl 0x0092ea6c
0092ea44	cmp w0,#0x0
0092ea48	b.gt 0x0092ea60
0092ea4c	ldp x29,x30,[sp, #0x10]
0092ea50	mov x0,x19
0092ea54	ldr x19,[sp], #0x20
0092ea58	b 0x0092b1f4
0092ea5c	mov w0,#0x8
0092ea60	ldp x29,x30,[sp, #0x10]
0092ea64	ldr x19,[sp], #0x20
0092ea68	ret
