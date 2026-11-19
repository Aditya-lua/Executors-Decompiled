; FUN_0084ebf8 @ 0084ebf8
0084ebf8	adrp x8,0xd1a000
0084ebfc	adrp x9,0xc4a000
0084ec00	add x9,x9,#0x508
0084ec04	ldr w8,[x8, #0xfe0]
0084ec08	str x9,[x0]
0084ec0c	str w8,[x0, #0x8]
0084ec10	adrp x8,0xc49000
0084ec14	add x8,x8,#0x340
0084ec18	ldr q0,[x1]
0084ec1c	str x8,[x0]
0084ec20	strb w2,[x0, #0x1c]
0084ec24	stur q0,[x0, #0xc]
0084ec28	ret
