/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99c490..0x99c57c (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99c490_0 {
    char padding_0[120];
    long long field_78;
    char padding_80[112];
    unsigned int field_f0;
    char padding_f4[1044];
    long long field_508;
    char padding_510[960];
    long long field_8d0;
    char padding_8d8[576];
    unsigned int field_b18;
    long long field_b1c;
} st_99c490_0;


long long sub_99c490(st_99c490_0 *a0, unsigned int a1, long long a2)
{
    long long v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return 1;
    if ((int)a0->field_78)
    {
        if (!*(int *)&a0[1].padding_8d8[320] || !(int)a0->field_508 || a0->field_f0 != 9 || !(&a0->field_b18)[1] || (int)a0->field_8d0)
        {
            a0->field_b18 = 1;
        }
        else if (*(long long *)&a0[1].padding_8d8[360])
        {
            (*(long long *)&a0[1].padding_8d8[360])();
        }
        else
        {
            a0->field_b18 = 2;
            v2 = (unsigned int)sub_96f630();
            if (!v2)
                return v2;
        }
    }
    else
    {
        if (a1 == 0x400 && !(&a0->field_b18)[1])
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions.c", 1652, "final_early_data");
            sub_9a58a4(a0, 47, 233, 0);
            return 0;
        }
    }
    return 1;
}
