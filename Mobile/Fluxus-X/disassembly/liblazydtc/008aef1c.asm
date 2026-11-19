; FUN_008aef1c @ 008aef1c
008aef1c	stp x29,x30,[sp, #-0x30]!
008aef20	stp x22,x21,[sp, #0x10]
008aef24	stp x20,x19,[sp, #0x20]
008aef28	mov x29,sp
008aef2c	mov x20,x3
008aef30	mov x19,x2
008aef34	mov w21,w1
008aef38	mov x22,x0
008aef3c	bl 0x008ab0e0
008aef40	cmp w0,#0x0
008aef44	b.le 0x008aef74
008aef48	mov x0,x22
008aef4c	mov w1,w21
008aef50	mov x2,x20
008aef54	bl 0x008ab8a4
008aef58	mov x19,x0
008aef5c	cbz x0,0x008aef94
008aef60	mov x0,x19
008aef64	ldp x20,x19,[sp, #0x20]
008aef68	ldp x22,x21,[sp, #0x10]
008aef6c	ldp x29,x30,[sp], #0x30
008aef70	ret
008aef74	cbz x20,0x008aef60
008aef78	cbz x19,0x008aef8c
008aef7c	mov x0,x19
008aef80	bl 0x00c2ff50
008aef84	str x0,[x20]
008aef88	b 0x008aef60
008aef8c	str xzr,[x20]
008aef90	b 0x008aef60
008aef94	mov x0,x22
008aef98	mov w1,w21
008aef9c	mov w2,#0x5
008aefa0	bl 0x008af05c
