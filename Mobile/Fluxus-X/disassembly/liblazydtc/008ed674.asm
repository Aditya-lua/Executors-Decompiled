; cpr::Session::SetDebugCallback @ 008ed674
008ed674	sub sp,sp,#0x80
008ed678	str x23,[sp, #0x40]
008ed67c	stp x22,x21,[sp, #0x50]
008ed680	stp x20,x19,[sp, #0x60]
008ed684	stp x29,x30,[sp, #0x70]
008ed688	add x29,sp,#0x70
008ed68c	mrs x23,tpidr_el0
008ed690	ldr x8,[x23, #0x28]
008ed694	adrp x2,0xcb4000
008ed698	mov x19,x0
008ed69c	mov x22,x1
008ed6a0	str x8,[sp, #0x38]
008ed6a4	ldr x8,[x0, #0x18]
008ed6a8	mov w1,#0x4e7e
008ed6ac	ldr x0,[x8]
008ed6b0	ldr x2,[x2, #0xce0]
008ed6b4	bl 0x00c317c0
008ed6b8	ldr x8,[x22]
008ed6bc	add x20,x19,#0x1e0
008ed6c0	add x21,x19,#0x1f0
008ed6c4	str x8,[x19, #0x1e0]
008ed6c8	ldr x0,[x22, #0x30]
008ed6cc	cbz x0,0x008ed6f0
008ed6d0	add x8,x22,#0x10
008ed6d4	cmp x8,x0
008ed6d8	b.eq 0x008ed6f8
008ed6dc	ldr x8,[x0]
008ed6e0	ldr x8,[x8, #0x10]
008ed6e4	blr x8
008ed6e8	str x0,[sp, #0x20]
008ed6ec	b 0x008ed710
008ed6f0	str xzr,[sp, #0x20]
008ed6f4	b 0x008ed710
008ed6f8	mov x8,sp
008ed6fc	str x8,[sp, #0x20]
008ed700	ldr x8,[x0]
008ed704	mov x1,sp
008ed708	ldr x8,[x8, #0x18]
008ed70c	blr x8
008ed710	mov x0,sp
008ed714	mov x1,x21
008ed718	mov x22,sp
008ed71c	bl 0x00c31750
008ed720	ldr x0,[sp, #0x20]
008ed724	cmp x22,x0
008ed728	b.eq 0x008ed73c
008ed72c	cbz x0,0x008ed748
008ed730	ldr x8,[x0]
008ed734	ldr x8,[x8, #0x28]
008ed738	b 0x008ed744
008ed73c	ldr x8,[x0]
008ed740	ldr x8,[x8, #0x20]
008ed744	blr x8
008ed748	ldr x8,[x19, #0x18]
008ed74c	mov w1,#0x276f
008ed750	mov x2,x20
008ed754	ldr x0,[x8]
008ed758	bl 0x00c317c0
008ed75c	ldr x8,[x19, #0x18]
008ed760	mov w1,#0x29
008ed764	mov w2,#0x1
008ed768	ldr x0,[x8]
008ed76c	bl 0x00c317c0
008ed770	ldr x8,[x23, #0x28]
008ed774	ldr x9,[sp, #0x38]
008ed778	cmp x8,x9
008ed77c	b.ne 0x008ed798
008ed780	ldp x29,x30,[sp, #0x70]
008ed784	ldp x20,x19,[sp, #0x60]
008ed788	ldp x22,x21,[sp, #0x50]
008ed78c	ldr x23,[sp, #0x40]
008ed790	add sp,sp,#0x80
008ed794	ret
008ed798	bl 0x00c2fec0
