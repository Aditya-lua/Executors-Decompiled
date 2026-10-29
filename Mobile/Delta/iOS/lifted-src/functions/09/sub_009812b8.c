/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9812b8..0x981378 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9812b8(unsigned long long *a0, unsigned long a1, unsigned int a2)
{
    unsigned long v5;  // x0
    unsigned long v0;  // [bp-0x30]
    unsigned int v1;  // [bp-0x30]
    unsigned long v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = 0;
    v2 = 0;
    if (a1)
    {
        if (a2)
        {
            if (sub_9d4868(a1, &v0))
                goto LABEL_9812f0;
        }
        else
        {
            if (sub_9d46dc(a1, &v0))
            {
LABEL_9812f0:
                if ((unsigned int)v0 == 1 && (int)v2 < 0)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/quic/quic_port.c", 289, "validate_poll_descriptor");
                    sub_a36abc(20, 0x80106, 0);
                    return 0;
                }
                goto LABEL_981348;
            }
        }
    }
    v1 = 0;
LABEL_981348:
    v5 = *a0 + 40;
    if (a2)
        sub_982cf4(v5, &v0);
    else
        sub_982cb8(v5, &v0);
    return 1;
}
