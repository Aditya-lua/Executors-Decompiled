; FUN_008aefdc @ 008aefdc
008aefdc	stp x29,x30,[sp, #-0x20]!
008aefe0	stp x20,x19,[sp, #0x10]
008aefe4	mov x29,sp
008aefe8	mov x19,x1
008aefec	mov w1,#0xffffd8f0
008aeff0	mov x20,x0
008aeff4	mov x2,x19
008aeff8	bl 0x008acba4
008aeffc	mov x0,x20
008af000	mov w1,#0xffffffff
008af004	bl 0x008ab0e0
008af008	cbz w0,0x008af014
008af00c	mov w0,wzr
008af010	b 0x008af050
008af014	mov x0,x20
008af018	mov w1,#0xfffffffe
008af01c	bl 0x008aa994
008af020	mov x0,x20
008af024	mov w1,wzr
008af028	mov w2,wzr
008af02c	bl 0x008ad0b0
008af030	mov x0,x20
008af034	mov w1,#0xffffffff
008af038	bl 0x008aaf04
008af03c	mov x0,x20
008af040	mov w1,#0xffffd8f0
008af044	mov x2,x19
008af048	bl 0x008ad800
008af04c	mov w0,#0x1
008af050	ldp x20,x19,[sp, #0x10]
008af054	ldp x29,x30,[sp], #0x20
008af058	ret
