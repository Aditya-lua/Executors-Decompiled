/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d64..0x9e1c (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d64_0 {
    char field_0;
    char field_1;
    char field_2;
    char field_3;
} st_9d64_0;


unsigned int sub_9d64(st_9d64_0 *a0, unsigned int a1)
{
    unsigned int v0;  // w8

    if (127 >= a1)
    {
        a0->field_0 = a1;
        return 1;
    }
    else if (0x7ff >= a1)
    {
        a0->field_0 = (char)(a1 >> 6) | 192;
        a0->field_1 = 128 | (128 | (char)a1 & 63) & 63;
        return 2;
    }
    else
    {
        v0 = a1 >> 16;
        if (!v0)
        {
            a0->field_0 = (char)(a1 >> 12) | 224;
            a0->field_1 = 128 | (128 | (char)(__ROL__(a1, 26)) & 63) & 63;
            a0->field_2 = 128 | (128 | (char)a1 & 63) & 63;
            return 3;
        }
        else if (16 >= v0)
        {
            a0->field_0 = (char)(a1 >> 18) | 240;
            a0->field_1 = 128 | (128 | (char)(__ROL__(a1, 20)) & 63) & 63;
            a0->field_2 = 128 | (128 | (char)(__ROL__(a1, 26)) & 63) & 63;
            a0->field_3 = 128 | (128 | (char)a1 & 63) & 63;
            return 4;
        }
        else
        {
            return 0;
        }
    }
}
