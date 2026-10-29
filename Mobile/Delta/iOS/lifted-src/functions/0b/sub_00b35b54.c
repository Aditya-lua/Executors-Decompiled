/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35b54..0xb35bcc (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b35b54_0 {
    long long field_0;
    char padding_8[48];
    unsigned long long field_38;
    long long field_40;
} st_b35b54_0;


unsigned long long sub_b35b54(st_b35b54_0 *a0, long long a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a18c08(a0->field_0);
    a0->field_0 = 0;
    if (a1)
    {
        if (sub_a186b4(sub_a1abcc(sub_9ffdd0(a1))) && (v2 = sub_a646b8(), a0->field_40 = v2, v2))
        {
            v3 = sub_a18cf0(a1);
            if (!(unsigned int)v3)
                return v3;
            a0->field_0 = a1;
            a0->field_38 = "HKDF";
        }
        else
        {
            return 0xfffffffe;
        }
    }
    return 1;
}
