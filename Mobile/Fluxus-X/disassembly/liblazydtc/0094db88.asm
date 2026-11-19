; FUN_0094db88 @ 0094db88
0094db88	stp x20,x19,[sp, #-0x20]!
0094db8c	stp x29,x30,[sp, #0x10]
0094db90	add x29,sp,#0x10
0094db94	ldr x20,[x0, #0x20]
0094db98	mov x19,x1
0094db9c	mov w2,wzr
0094dba0	mov w3,wzr
0094dba4	add x1,x20,#0x428
0094dba8	bl 0x009450b4
0094dbac	ldrb w8,[x20, #0x536]
0094dbb0	cmp w8,#0x0
0094dbb4	cset w8,eq
0094dbb8	strb w8,[x19]
0094dbbc	ldp x29,x30,[sp, #0x10]
0094dbc0	ldp x20,x19,[sp], #0x20
0094dbc4	ret
