; FUN_0095c65c @ 0095c65c
0095c65c	stp x20,x19,[sp, #-0x20]!
0095c660	stp x29,x30,[sp, #0x10]
0095c664	add x29,sp,#0x10
0095c668	mov x19,x0
0095c66c	add x20,x0,x1
0095c670	strb wzr,[x0]
0095c674	bl 0x00c320b0
0095c678	sturb wzr,[x20, #-0x1]
0095c67c	cbnz w0,0x0095c69c
0095c680	mov w1,#0x2e
0095c684	mov x0,x19
0095c688	bl 0x00c30890
0095c68c	mov x8,x0
0095c690	cbz x0,0x0095c69c
0095c694	mov w0,wzr
0095c698	strb wzr,[x8]
0095c69c	ldp x29,x30,[sp, #0x10]
0095c6a0	ldp x20,x19,[sp], #0x20
0095c6a4	ret
