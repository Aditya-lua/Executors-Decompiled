; ix::WebSocketTransport::appendToSendBuffer<ix::IXWebSocketSendData::IXWebSocketSendData_const_iterator<char>> @ 0099aa10
0099aa10	sub sp,sp,#0x70
0099aa14	stp x26,x25,[sp, #0x20]
0099aa18	stp x24,x23,[sp, #0x30]
0099aa1c	stp x22,x21,[sp, #0x40]
0099aa20	stp x20,x19,[sp, #0x50]
0099aa24	stp x29,x30,[sp, #0x60]
0099aa28	add x29,sp,#0x60
0099aa2c	mrs x26,tpidr_el0
0099aa30	ldr x8,[x26, #0x28]
0099aa34	add x19,x0,#0x68
0099aa38	mov x21,x0
0099aa3c	mov x0,x19
0099aa40	mov x20,x5
0099aa44	mov x22,x4
0099aa48	mov x23,x3
0099aa4c	mov x24,x2
0099aa50	mov x25,x1
0099aa54	str x8,[sp, #0x18]
0099aa58	bl 0x00c2ff10
0099aa5c	ldr x1,[x21, #0x58]
0099aa60	ldp x2,x3,[x25]
0099aa64	add x25,x21,#0x50
0099aa68	mov x0,x25
0099aa6c	bl 0x00c33f70
0099aa70	ldr x8,[x24]
0099aa74	ldr x1,[x21, #0x58]
0099aa78	str x8,[sp, #0x10]
0099aa7c	ldr x8,[x23]
0099aa80	str x8,[sp, #0x8]
0099aa84	add x2,sp,#0x10
0099aa88	add x3,sp,#0x8
0099aa8c	mov x0,x25
0099aa90	bl 0x00c33f60
0099aa94	add x8,x21,#0x18
0099aa98	ldarb w8,[x8]
0099aa9c	tbz w8,#0x0,0x0099aad4
0099aaa0	cbz x22,0x0099aad4
0099aaa4	mov x8,xzr
0099aaa8	neg x9,x22
0099aaac	ldr x10,[x21, #0x58]
0099aab0	and x11,x8,#0x3
0099aab4	ldrb w11,[x20, x11]
0099aab8	add x10,x10,x9
0099aabc	ldrb w12,[x10, x8]
0099aac0	eor w11,w12,w11
0099aac4	strb w11,[x10, x8]
0099aac8	add x8,x8,#0x1
0099aacc	cmn x9,x8
0099aad0	b.ne 0x0099aaac
0099aad4	mov x0,x19
0099aad8	bl 0x00c2ff20
0099aadc	ldr x8,[x26, #0x28]
0099aae0	ldr x9,[sp, #0x18]
0099aae4	cmp x8,x9
0099aae8	b.ne 0x0099ab08
0099aaec	ldp x29,x30,[sp, #0x60]
0099aaf0	ldp x20,x19,[sp, #0x50]
0099aaf4	ldp x22,x21,[sp, #0x40]
0099aaf8	ldp x24,x23,[sp, #0x30]
0099aafc	ldp x26,x25,[sp, #0x20]
0099ab00	add sp,sp,#0x70
0099ab04	ret
0099ab08	bl 0x00c2fec0
