; curl_multi_socket_action @ 0092eea8
0092eea8	str x19,[sp, #-0x20]!
0092eeac	stp x29,x30,[sp, #0x10]
0092eeb0	add x29,sp,#0x10
0092eeb4	ldrb w8,[x0, #0x231]
0092eeb8	mov x4,x3
0092eebc	mov w3,w2
0092eec0	mov x19,x0
0092eec4	mov w2,w1
0092eec8	tbnz w8,#0x2,0x0092eef0
0092eecc	mov x0,x19
0092eed0	mov w1,wzr
0092eed4	bl 0x0092ea6c
0092eed8	cmp w0,#0x0
0092eedc	b.gt 0x0092eef4
0092eee0	ldp x29,x30,[sp, #0x10]
0092eee4	mov x0,x19
0092eee8	ldr x19,[sp], #0x20
0092eeec	b 0x0092b1f4
0092eef0	mov w0,#0x8
0092eef4	ldp x29,x30,[sp, #0x10]
0092eef8	ldr x19,[sp], #0x20
0092eefc	ret
