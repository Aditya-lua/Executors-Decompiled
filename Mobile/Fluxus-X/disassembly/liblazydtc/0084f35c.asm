; FUN_0084f35c @ 0084f35c
0084f35c	stp x29,x30,[sp, #-0x20]!
0084f360	stp x20,x19,[sp, #0x10]
0084f364	mov x29,sp
0084f368	ldr x8,[x1]
0084f36c	mov x20,x0
0084f370	mov x19,x1
0084f374	mov x0,x1
0084f378	mov x1,x20
0084f37c	ldr x8,[x8, #0xa8]
0084f380	blr x8
0084f384	tbz w0,#0x0,0x0084f3b8
0084f388	ldr x0,[x20, #0x20]
0084f38c	mov x1,x19
0084f390	ldr x8,[x0]
0084f394	ldr x8,[x8]
0084f398	blr x8
0084f39c	ldr x0,[x20, #0x28]
0084f3a0	ldr x8,[x0]
0084f3a4	ldr x2,[x8]
0084f3a8	mov x1,x19
0084f3ac	ldp x20,x19,[sp, #0x10]
0084f3b0	ldp x29,x30,[sp], #0x20
0084f3b4	br x2
0084f3b8	ldp x20,x19,[sp, #0x10]
0084f3bc	ldp x29,x30,[sp], #0x20
0084f3c0	ret
