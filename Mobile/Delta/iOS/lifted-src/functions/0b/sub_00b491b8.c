/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb491b8..0xb49278 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b491b8_0 {
    unsigned long long field_0;
    char padding_8[232];
    long long field_f0;
} st_b491b8_0;


unsigned long long sub_b491b8(st_b491b8_0 *a0, long long a1)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_b46ff0();
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (v0)
    {
        return 1;
    }
    else
    {
        if (a0->field_0)
        {
            v4 = sub_a7c17c(a0->field_0);
            if (!(unsigned int)v4)
                return v4;
        }
        v5 = sub_a6fbc4(a1, "digest");
        if (v5)
        {
            v6 = sub_954340(a0->field_f0);
            if (v6)
            {
                v6 = sub_a71468(v5, sub_a50a58());
                if ((unsigned int)v6)
                    goto LABEL_b49240;
            }
        }
        else
        {
LABEL_b49240:
            v6 = sub_b46e6c(a0, a1);
        }
        if (!a0->field_0)
            return v6;
        sub_a7c1b4(a0->field_0);
        return v6;
    }
}
