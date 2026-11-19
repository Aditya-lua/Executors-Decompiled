; curl_multi_socket_all @ 0092ef00
0092ef00	str x19,[sp, #-0x20]!
0092ef04	stp x29,x30,[sp, #0x10]
0092ef08	add x29,sp,#0x10
0092ef0c	ldrb w8,[x0, #0x231]
0092ef10	mov x19,x0
0092ef14	mov x4,x1
0092ef18	tbnz w8,#0x2,0x0092ef48
0092ef1c	mov w1,#0x1
0092ef20	mov w2,#0xffffffff
0092ef24	mov x0,x19
0092ef28	mov w3,wzr
0092ef2c	bl 0x0092ea6c
0092ef30	cmp w0,#0x0
0092ef34	b.gt 0x0092ef4c
0092ef38	ldp x29,x30,[sp, #0x10]
0092ef3c	mov x0,x19
0092ef40	ldr x19,[sp], #0x20
0092ef44	b 0x0092b1f4
0092ef48	mov w0,#0x8
0092ef4c	ldp x29,x30,[sp, #0x10]
0092ef50	ldr x19,[sp], #0x20
0092ef54	ret
