/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x953f4c..0x954044 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_953f4c_1 {
    unsigned long long field_0;
} st_953f4c_1;

typedef struct st_953f4c_0 {
    struct st_953f4c_0 *field_0;
    char padding_8[104];
    struct st_953f4c_1 *field_70;
} st_953f4c_0;


unsigned int sub_953f4c(st_953f4c_0 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0xffffffff;
    }
    else if (!(int)a0->field_0)
    {
        if (sub_9a5694() && !sub_9a5960(a0))
            a0->field_70();
        if (a3 > 0x4000)
        {
            sub_a368c8();
            sub_a369bc("ssl/d1_msg.c", 33, "dtls1_write_app_data_bytes");
            sub_a36abc(20, 334, 0);
            return 0xffffffff;
        }
    }
    else
    {
        return 0xffffffff;
    }
}
