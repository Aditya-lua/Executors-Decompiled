; FUN_0084ffa4 @ 0084ffa4
0084ffa4	stp x29,x30,[sp, #-0x20]!
0084ffa8	stp x20,x19,[sp, #0x10]
0084ffac	mov x29,sp
0084ffb0	ldr x8,[x1]
0084ffb4	mov x20,x0
0084ffb8	mov x19,x1
0084ffbc	mov x0,x1
0084ffc0	mov x1,x20
0084ffc4	ldr x8,[x8, #0x128]
0084ffc8	blr x8
0084ffcc	tbz w0,#0x0,0x00850048
0084ffd0	ldr x8,[x20, #0x20]
0084ffd4	ldr x0,[x8, #0x38]
0084ffd8	cbz x0,0x0084ffec
0084ffdc	ldr x8,[x0]
0084ffe0	mov x1,x19
0084ffe4	ldr x8,[x8]
0084ffe8	blr x8
0084ffec	ldr x0,[x20, #0x28]
0084fff0	mov x1,x19
0084fff4	ldr x8,[x0]
0084fff8	ldr x8,[x8]
0084fffc	blr x8
00850000	ldr x0,[x20, #0x30]
00850004	mov x1,x19
00850008	ldr x8,[x0]
0085000c	ldr x8,[x8]
00850010	blr x8
00850014	ldr x0,[x20, #0x38]
00850018	cbz x0,0x0085002c
0085001c	ldr x8,[x0]
00850020	mov x1,x19
00850024	ldr x8,[x8]
00850028	blr x8
0085002c	ldr x0,[x20, #0x40]
00850030	ldr x8,[x0]
00850034	ldr x2,[x8]
00850038	mov x1,x19
0085003c	ldp x20,x19,[sp, #0x10]
00850040	ldp x29,x30,[sp], #0x20
00850044	br x2
00850048	ldp x20,x19,[sp, #0x10]
0085004c	ldp x29,x30,[sp], #0x20
00850050	ret
