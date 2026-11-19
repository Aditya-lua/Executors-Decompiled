; cpr::CancellationCallback::SetProgressCallback @ 008e73c4
008e73c4	ldrb w8,[x0, #0x18]
008e73c8	cbz w8,0x008e73d0
008e73cc	strb wzr,[x0, #0x18]
008e73d0	mov w8,#0x1
008e73d4	str x1,[x0, #0x10]
008e73d8	strb w8,[x0, #0x18]
008e73dc	ret
