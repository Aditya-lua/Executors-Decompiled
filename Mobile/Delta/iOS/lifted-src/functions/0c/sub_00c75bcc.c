/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75bcc..0xc75c44 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_c75bcc(void)
{
    long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_c14db8(3, 0);
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (/* unsupported instruction */)
        {
            /* unsupported instruction */;
            goto LABEL_c75c04;
        }
    } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
    return v2;
LABEL_c75c04:
    if (v2[1])
        _free(*v2);
    _free();
    return /* unsupported instruction */;
}
