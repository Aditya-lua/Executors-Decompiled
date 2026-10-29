/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e4838..0x9e48c8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_9e4838(void* a0)
{
    unsigned long v2;  // x9
    unsigned long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
        return a0;
    if (*(long long *)a0)
    {
        v2 = (int)a0[20];
        if (!(v2 >> 1 & 1))
        {
            v3 = (int)a0[12] * 8;
            if (!(v2 >> 3 & 1))
                sub_a6c4e8(*(long long *)a0, v3, "crypto/bn/bn_lib.c", 207);
            else
                sub_a6d4c0(*(long long *)a0, v3, "crypto/bn/bn_lib.c", 205);
        }
    }
    if (!((char)a0[20] & 1))
        return a0;
    sub_a66ec0();
}
