; SSL_CTX_add1_to_CA_list @ 009acfc8
009acfc8	stp x20,x19,[sp, #-0x20]!
009acfcc	stp x29,x30,[sp, #0x10]
009acfd0	add x29,sp,#0x10
009acfd4	cbz x1,0x009ad028
009acfd8	ldr x8,[x0, #0x128]
009acfdc	mov x20,x1
009acfe0	mov x19,x0
009acfe4	cbnz x8,0x009acff4
009acfe8	bl 0x00c34780
009acfec	str x0,[x19, #0x128]
009acff0	cbz x0,0x009ad02c
009acff4	mov x0,x20
009acff8	bl 0x00c32d20
009acffc	bl 0x00c34f50
009ad000	cbz x0,0x009ad02c
009ad004	mov x20,x0
009ad008	ldr x0,[x19, #0x128]
009ad00c	mov x1,x20
009ad010	bl 0x00c347a0
009ad014	cbz w0,0x009ad020
009ad018	mov w0,#0x1
009ad01c	b 0x009ad02c
009ad020	mov x0,x20
009ad024	bl 0x00c34810
009ad028	mov w0,wzr
009ad02c	ldp x29,x30,[sp, #0x10]
009ad030	ldp x20,x19,[sp], #0x20
009ad034	ret
