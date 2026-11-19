; FUN_00b318bc @ 00b318bc
00b318bc	stp x22,x21,[sp, #-0x30]!
00b318c0	stp x20,x19,[sp, #0x10]
00b318c4	stp x29,x30,[sp, #0x20]
00b318c8	add x29,sp,#0x20
00b318cc	mov x22,x3
00b318d0	mov x19,x2
00b318d4	mov x21,x1
00b318d8	mov x20,x0
00b318dc	bl 0x00c41000
00b318e0	mov w8,w0
00b318e4	cmp x22,#0x24
00b318e8	mov w0,wzr
00b318ec	b.cc 0x00b31910
00b318f0	cbz w8,0x00b31910
00b318f4	mov x0,x21
00b318f8	mov x1,x20
00b318fc	bl 0x00c3e650
00b31900	cbz w0,0x00b31910
00b31904	mov w8,#0x24
00b31908	mov w0,#0x1
00b3190c	str x8,[x19]
00b31910	ldp x29,x30,[sp, #0x20]
00b31914	ldp x20,x19,[sp, #0x10]
00b31918	ldp x22,x21,[sp], #0x30
00b3191c	ret
