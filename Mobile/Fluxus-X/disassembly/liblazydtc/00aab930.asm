; FUN_00aab930 @ 00aab930
00aab930	ldrb w10,[x0, #0xf]
00aab934	and x8,x1,#0xffffffff
00aab938	lsl w9,w10,w8
00aab93c	strb w9,[x2, #0xf]
00aab940	ldrb w11,[x0, #0xe]
00aab944	mov w9,#0x8
00aab948	sub w9,w9,w1
00aab94c	lsr w10,w10,w9
00aab950	lsl w12,w11,w8
00aab954	orr w10,w12,w10
00aab958	strb w10,[x2, #0xe]
00aab95c	ldrb w10,[x0, #0xd]
00aab960	lsr w11,w11,w9
00aab964	lsl w12,w10,w8
00aab968	orr w11,w12,w11
00aab96c	strb w11,[x2, #0xd]
00aab970	ldrb w11,[x0, #0xc]
00aab974	lsr w10,w10,w9
00aab978	lsl w12,w11,w8
00aab97c	orr w10,w12,w10
00aab980	strb w10,[x2, #0xc]
00aab984	ldrb w10,[x0, #0xb]
00aab988	lsr w11,w11,w9
00aab98c	lsl w12,w10,w8
00aab990	orr w11,w12,w11
00aab994	strb w11,[x2, #0xb]
00aab998	ldrb w11,[x0, #0xa]
00aab99c	lsr w10,w10,w9
00aab9a0	lsl w12,w11,w8
00aab9a4	orr w10,w12,w10
00aab9a8	strb w10,[x2, #0xa]
00aab9ac	ldrb w10,[x0, #0x9]
00aab9b0	lsr w11,w11,w9
00aab9b4	lsl w12,w10,w8
00aab9b8	orr w11,w12,w11
00aab9bc	strb w11,[x2, #0x9]
00aab9c0	ldrb w11,[x0, #0x8]
00aab9c4	lsr w10,w10,w9
00aab9c8	lsl w12,w11,w8
00aab9cc	orr w10,w12,w10
00aab9d0	strb w10,[x2, #0x8]
00aab9d4	ldrb w10,[x0, #0x7]
00aab9d8	lsr w11,w11,w9
00aab9dc	lsl w12,w10,w8
00aab9e0	orr w11,w12,w11
00aab9e4	strb w11,[x2, #0x7]
00aab9e8	ldrb w11,[x0, #0x6]
00aab9ec	lsr w10,w10,w9
00aab9f0	lsl w12,w11,w8
00aab9f4	orr w10,w12,w10
00aab9f8	strb w10,[x2, #0x6]
00aab9fc	ldrb w10,[x0, #0x5]
00aaba00	lsr w11,w11,w9
00aaba04	lsl w12,w10,w8
00aaba08	orr w11,w12,w11
00aaba0c	strb w11,[x2, #0x5]
00aaba10	ldrb w11,[x0, #0x4]
00aaba14	lsr w10,w10,w9
00aaba18	lsl w12,w11,w8
00aaba1c	orr w10,w12,w10
00aaba20	strb w10,[x2, #0x4]
00aaba24	ldrb w10,[x0, #0x3]
00aaba28	lsr w11,w11,w9
00aaba2c	lsl w12,w10,w8
00aaba30	orr w11,w12,w11
00aaba34	strb w11,[x2, #0x3]
00aaba38	ldrb w11,[x0, #0x2]
00aaba3c	lsr w10,w10,w9
00aaba40	lsl w12,w11,w8
00aaba44	orr w10,w12,w10
00aaba48	strb w10,[x2, #0x2]
00aaba4c	ldrb w10,[x0, #0x1]
00aaba50	lsr w11,w11,w9
00aaba54	lsl w12,w10,w8
00aaba58	orr w11,w12,w11
00aaba5c	strb w11,[x2, #0x1]
00aaba60	ldrb w11,[x0]
00aaba64	lsr w9,w10,w9
00aaba68	lsl w8,w11,w8
00aaba6c	orr w8,w8,w9
00aaba70	strb w8,[x2]
00aaba74	ret
