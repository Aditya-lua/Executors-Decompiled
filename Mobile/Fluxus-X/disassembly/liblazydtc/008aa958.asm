; FUN_008aa958 @ 008aa958
008aa958	mov w8,#0xffffd8f0
008aa95c	sub w9,w1,#0x1
008aa960	cmp w9,w8
008aa964	b.cc 0x008aa97c
008aa968	ldp x8,x9,[x0, #0x68]
008aa96c	sub x8,x8,x9
008aa970	lsr x8,x8,#0x4
008aa974	add w8,w1,w8
008aa978	add w1,w8,#0x1
008aa97c	mov w0,w1
008aa980	ret
